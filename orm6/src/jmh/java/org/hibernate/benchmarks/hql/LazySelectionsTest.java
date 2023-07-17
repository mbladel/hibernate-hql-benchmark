package org.hibernate.benchmarks.hql;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hibernate.benchmarks.hql.model.EntityOfBasics;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.infra.Blackhole;

/**
 * @author Marco Belladelli
 */
public class LazySelectionsTest {
	@Benchmark
	@BenchmarkMode( Mode.AverageTime )
	@OutputTimeUnit( TimeUnit.MICROSECONDS )
	public void simpleLoadTest(BenchmarkState state, Blackhole blackhole) {
		try (PersistenceContext pc = state.getPersistenceContextAccess().get()) {
			final List<EntityOfBasics> resultList = pc.createQuery(
					"from EntityOfBasics",
					EntityOfBasics.class
			).getResults();
			assert resultList.size() == 10;
			blackhole.consume( resultList );
		}
	}
}
