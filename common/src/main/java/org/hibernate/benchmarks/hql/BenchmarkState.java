/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.benchmarks.hql;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.hibernate.benchmarks.hql.model.Component;
import org.hibernate.benchmarks.hql.model.CompositionEntity;
import org.hibernate.benchmarks.hql.model.EntityOfBasics;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;

/**
 * @author Andrea Boriero
 */
@State( Scope.Benchmark )
public class BenchmarkState {
	private VersionSupport versionSupport;
	private HqlSemanticTreeBuilder hqlSemanticTreeBuilder;

	public HqlSemanticTreeBuilder getHqlSemanticTreeBuilder() {
		return hqlSemanticTreeBuilder;
	}

	public Supplier<PersistenceContext> getPersistenceContextAccess() {
		return versionSupport::createPersistenceContext;
	}

	@Setup
	public void setUp() {
		try {
			final ServiceLoader<VersionSupportFactory> discoveredFactories = ServiceLoader.load( VersionSupportFactory.class );

			final Iterator<VersionSupportFactory> implItr = discoveredFactories.iterator();

			if ( !implItr.hasNext() ) {
				throw new RuntimeException( "Could not locate VersionSupportFactory service" );
			}

			final VersionSupportFactory factory = implItr.next();

			if ( implItr.hasNext() ) {
				throw new RuntimeException( "Multiple VersionSupportFactory service impls found" );
			}

			versionSupport = factory.buildVersionSupport();

			hqlSemanticTreeBuilder = versionSupport.getHqlSemanticInterpreter();

			prepareExecutionData();
		}
		catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}

	private void prepareExecutionData() {
		inTransaction(
				em -> {
					{
						for ( int i = 1; i <= 10; i++ ) {
							final EntityOfBasics eob = new EntityOfBasics();
							eob.setId( i );
							eob.setGender( EntityOfBasics.Gender.MALE );
							eob.setGender2( EntityOfBasics.Gender.MALE );
							eob.setTheBoolean( true );
							eob.setTheBoolean2( true );
							eob.setTheNumericBoolean( true );
							eob.setTheNumericBoolean2( true );
							eob.setTheStringBoolean( true );
							eob.setTheStringBoolean( true );
							eob.setTheString( "string" );
							eob.setTheString2( "string" );
							eob.setTheInteger( 2 );
							eob.setTheInteger2( 2 );
							eob.setTheInt( 3 );
							eob.setTheInt2( 3 );
							eob.setTheDouble( 1d );
							eob.setTheDouble2( 1d );
							eob.setTheDate( new Date() );
							eob.setTheDate2( new Date() );
							eob.setTheTime( new Date() );
							eob.setTheTime2( new Date() );
							eob.setTheTimestamp( Timestamp.from( Instant.now() ) );
							eob.setTheTimestamp2( Timestamp.from( Instant.now() ) );
							eob.setTheInstant( Instant.now() );
							eob.setTheInstant2( Instant.now() );
							eob.setGender( EntityOfBasics.Gender.MALE );
							eob.setGender2( EntityOfBasics.Gender.MALE );
							eob.setGender2( EntityOfBasics.Gender.MALE );
							eob.setSingleCharGender( EntityOfBasics.Gender.MALE );
							eob.setSingleCharGender2( EntityOfBasics.Gender.MALE );
							eob.setOrdinalGender( EntityOfBasics.Gender.MALE );
							eob.setOrdinalGender2( EntityOfBasics.Gender.MALE );
							eob.setTheDuration( Duration.ZERO );
							eob.setTheDuration2( Duration.ZERO );
							eob.setTheLocalDateTime( LocalDateTime.now() );
							eob.setTheLocalDateTime2( LocalDateTime.now() );
							eob.setTheLocalDate( LocalDate.now() );
							eob.setTheLocalDate2( LocalDate.now() );
							eob.setTheLocalTime( LocalTime.now() );
							eob.setTheLocalTime2( LocalTime.now() );
							eob.setTheZonedDateTime( ZonedDateTime.now() );
							eob.setTheZonedDateTime2( ZonedDateTime.now() );
							eob.setTheOffsetDateTime( OffsetDateTime.now() );
							eob.setTheOffsetDateTime2( OffsetDateTime.now() );

							eob.setTheBoolean3( true );
							eob.setTheNumericBoolean3( true );
							eob.setTheStringBoolean3( true );
							eob.setTheString3( "string" );
							eob.setTheInteger3( 2 );
							eob.setTheInt3( 3 );
							eob.setTheDouble3( 1d );
							eob.setTheDate3( new Date() );
							eob.setTheTime3( new Date() );
							eob.setTheTimestamp3( Timestamp.from( Instant.now() ) );
							eob.setTheInstant3( Instant.now() );
							eob.setGender3( EntityOfBasics.Gender.MALE );
							eob.setSingleCharGender3( EntityOfBasics.Gender.MALE );
							eob.setOrdinalGender3( EntityOfBasics.Gender.MALE );
							eob.setTheDuration3( Duration.ZERO );
							eob.setTheLocalDateTime3( LocalDateTime.now() );
							eob.setTheLocalDate3( LocalDate.now() );
							eob.setTheLocalTime3( LocalTime.now() );
							eob.setTheZonedDateTime3( ZonedDateTime.now() );
							eob.setTheOffsetDateTime3( OffsetDateTime.now() );

							eob.setTheBoolean4( true );
							eob.setTheNumericBoolean4( true );
							eob.setTheStringBoolean4( true );
							eob.setTheString4( "string" );
							eob.setTheInteger4( 2 );
							eob.setTheInt4( 3 );
							eob.setTheDouble4( 1d );
							eob.setTheDate4( new Date() );
							eob.setTheTime4( new Date() );
							eob.setTheTimestamp4( Timestamp.from( Instant.now() ) );
							eob.setTheInstant4( Instant.now() );
							eob.setGender4( EntityOfBasics.Gender.MALE );
							eob.setSingleCharGender4( EntityOfBasics.Gender.MALE );
							eob.setOrdinalGender4( EntityOfBasics.Gender.MALE );
							eob.setTheDuration4( Duration.ZERO );
							eob.setTheLocalDateTime4( LocalDateTime.now() );
							eob.setTheLocalDate4( LocalDate.now() );
							eob.setTheLocalTime4( LocalTime.now() );
							eob.setTheZonedDateTime4( ZonedDateTime.now() );
							eob.setTheOffsetDateTime4( OffsetDateTime.now() );

							eob.setTheBoolean5( true );
							eob.setTheNumericBoolean5( true );
							eob.setTheStringBoolean5( true );
							eob.setTheString5( "string" );
							eob.setTheInteger5( 2 );
							eob.setTheInt5( 3 );
							eob.setTheDouble5( 1d );
							eob.setTheDate5( new Date() );
							eob.setTheTime5( new Date() );
							eob.setTheTimestamp5( Timestamp.from( Instant.now() ) );
							eob.setTheInstant5( Instant.now() );
							eob.setGender5( EntityOfBasics.Gender.MALE );
							eob.setSingleCharGender5( EntityOfBasics.Gender.MALE );
							eob.setOrdinalGender5( EntityOfBasics.Gender.MALE );
							eob.setTheDuration5( Duration.ZERO );
							eob.setTheLocalDateTime5( LocalDateTime.now() );
							eob.setTheLocalDate5( LocalDate.now() );
							eob.setTheLocalTime5( LocalTime.now() );
							eob.setTheZonedDateTime5( ZonedDateTime.now() );
							eob.setTheOffsetDateTime5( OffsetDateTime.now() );

							em.persist( eob );
						}
					}
				}
		);
	}

	private void inTransaction(Consumer<PersistenceContext> action) {
		try (final PersistenceContext pc = versionSupport.createPersistenceContext()) {
			final PersistenceContext.Transaction txn = pc.getTransaction();
			txn.begin();

			try {
				action.accept( pc );

				if ( !txn.isActive() ) {
					throw new RuntimeException( "Execution of action caused managed transaction to be completed" );
				}
			}
			catch (RuntimeException e) {
				if ( txn.isActive() ) {
					try {
						txn.rollback();
					}
					catch (Exception ignore) {
					}
				}

				throw e;
			}

			txn.commit();
		}
	}

	@TearDown
	public void tearDown() {
		try {
			cleanUpExecutionData();
		}
		catch (Throwable e) {
			System.out.println( "Error cleaning up test data" );
			e.printStackTrace();
		}

		try {
			if ( versionSupport != null ) {
				versionSupport.shutDown();
			}
		}
		catch (Throwable e) {
			System.out.println( "Error releasing VersionSupport" );
			e.printStackTrace();
		}
	}

	private void cleanUpExecutionData() {
		inTransaction(
				em -> {
					final QueryProxy<EntityOfBasics> query = em.createQuery(
							"select e from EntityOfBasics e",
							EntityOfBasics.class
					);

					for ( EntityOfBasics entity : query.getResults() ) {
						em.remove( entity );
					}
				}
		);
	}

	public void performMultiExecutions() {
		try (final PersistenceContext pc = versionSupport.createPersistenceContext()) {
			final QueryProxy<CompositionEntity> query1 = pc.createQuery(
					"select e from CompositionEntity e where e.description = :description",
					CompositionEntity.class
			);

			final CompositionEntity result1 = query1.setParameter( "description", "first" ).getSingleResult();
			assert result1 != null;
			assert "first".equals( result1.getDescription() );


			final QueryProxy<String> query2 = pc.createQuery(
					"select e.description from CompositionEntity e where e.description = :description",
					String.class
			);

			final String result2 = query2.setParameter( "description", "first" ).getSingleResult();
			assert result2 != null;
			assert "first".equals( result2 );


			final QueryProxy<Component> query3 = pc.createQuery(
					"select e.component from CompositionEntity e where e.description = :description",
					Component.class
			);

			final Component result3 = query3.setParameter( "description", "first" ).getSingleResult();
			assert result3 != null;
			assert "root - 1".equals( result3.getText() );
		}
	}
}
