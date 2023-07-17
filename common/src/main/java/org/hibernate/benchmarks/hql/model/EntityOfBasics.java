package org.hibernate.benchmarks.hql.model;

import java.net.URL;
import java.sql.Types;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * @author Marco Belladelli
 */
@Entity( name = "EntityOfBasics" )
public class EntityOfBasics {
	public enum Gender {
		MALE,
		FEMALE,
		OTHER
	}

	private Integer id;
	private Boolean theBoolean = false;
	private Boolean theNumericBoolean = false;
	private Boolean theStringBoolean = false;
	private String theString;
	private Integer theInteger;
	private int theInt;
	private double theDouble;
	private URL theUrl;
	private Date theDate;
	private Date theTime;
	private Date theTimestamp;
	private Instant theInstant;
	private Gender gender;
	private Gender singleCharGender;
	private Gender ordinalGender;
	private Duration theDuration;
	private LocalDateTime theLocalDateTime;
	private LocalDate theLocalDate;
	private LocalTime theLocalTime;
	private ZonedDateTime theZonedDateTime;
	private OffsetDateTime theOffsetDateTime;
	private Boolean theBoolean2 = false;
	private Boolean theNumericBoolean2 = false;
	private Boolean theStringBoolean2 = false;
	private String theString2;
	private Integer theInteger2;
	private int theInt2;
	private double theDouble2;
	private URL theUrl2;
	private Date theDate2;
	private Date theTime2;
	private Date theTimestamp2;
	private Instant theInstant2;
	private Gender gender2;
	private Gender singleCharGender2;
	private Gender ordinalGender2;
	private Duration theDuration2;
	private LocalDateTime theLocalDateTime2;
	private LocalDate theLocalDate2;
	private LocalTime theLocalTime2;
	private ZonedDateTime theZonedDateTime2;
	private OffsetDateTime theOffsetDateTime2;
	private Boolean theBoolean3;
	private Boolean theNumericBoolean3;
	private Boolean theStringBoolean3;
	private String theString3;
	private Integer theInteger3;
	private int theInt3;
	private double theDouble3;
	private URL theUrl3;
	private Date theDate3;
	private Date theTime3;
	private Date theTimestamp3;
	private Instant theInstant3;
	private Gender gender3;
	private Gender singleCharGender3;
	private Gender ordinalGender3;
	private Duration theDuration3;
	private LocalDateTime theLocalDateTime3;
	private LocalDate theLocalDate3;
	private LocalTime theLocalTime3;
	private ZonedDateTime theZonedDateTime3;
	private OffsetDateTime theOffsetDateTime3;
	private Boolean theBoolean4;
	private Boolean theNumericBoolean4;
	private Boolean theStringBoolean4;
	private String theString4;
	private Integer theInteger4;
	private int theInt4;
	private double theDouble4;
	private URL theUrl4;
	private Date theDate4;
	private Date theTime4;
	private Date theTimestamp4;
	private Instant theInstant4;
	private Gender gender4;
	private Gender singleCharGender4;
	private Gender ordinalGender4;
	private Duration theDuration4;
	private LocalDateTime theLocalDateTime4;
	private LocalDate theLocalDate4;
	private LocalTime theLocalTime4;
	private ZonedDateTime theZonedDateTime4;
	private OffsetDateTime theOffsetDateTime4;
	private Boolean theBoolean5;
	private Boolean theNumericBoolean5;
	private Boolean theStringBoolean5;
	private String theString5;
	private Integer theInteger5;
	private int theInt5;
	private double theDouble5;
	private URL theUrl5;
	private Date theDate5;
	private Date theTime5;
	private Date theTimestamp5;
	private Instant theInstant5;
	private Gender gender5;
	private Gender singleCharGender5;
	private Gender ordinalGender5;
	private Duration theDuration5;
	private LocalDateTime theLocalDateTime5;
	private LocalDate theLocalDate5;
	private LocalTime theLocalTime5;
	private ZonedDateTime theZonedDateTime5;
	private OffsetDateTime theOffsetDateTime5;

	public EntityOfBasics() {
	}

	public EntityOfBasics(Integer id) {
		this.id = id;
	}

	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTheString() {
		return theString;
	}

	public void setTheString(String theString) {
		this.theString = theString;
	}

	public Integer getTheInteger() {
		return theInteger;
	}

	public void setTheInteger(Integer theInteger) {
		this.theInteger = theInteger;
	}

	public int getTheInt() {
		return theInt;
	}

	public void setTheInt(int theInt) {
		this.theInt = theInt;
	}

	public double getTheDouble() {
		return theDouble;
	}

	public void setTheDouble(double theDouble) {
		this.theDouble = theDouble;
	}

	public URL getTheUrl() {
		return theUrl;
	}

	public void setTheUrl(URL theUrl) {
		this.theUrl = theUrl;
	}

	@Enumerated( EnumType.STRING )
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Enumerated( EnumType.STRING )
	public Gender getSingleCharGender() {
		return singleCharGender;
	}

	public void setSingleCharGender(Gender singleCharGender) {
		this.singleCharGender = singleCharGender;
	}

	@Column( name = "ordinal_gender" )
	public Gender getOrdinalGender() {
		return ordinalGender;
	}

	public void setOrdinalGender(Gender ordinalGender) {
		this.ordinalGender = ordinalGender;
	}

	@Temporal( TemporalType.DATE )
	public Date getTheDate() {
		return theDate;
	}

	public void setTheDate(Date theDate) {
		this.theDate = theDate;
	}

	@Temporal( TemporalType.TIME )
	public Date getTheTime() {
		return theTime;
	}

	public void setTheTime(Date theTime) {
		this.theTime = theTime;
	}

	@Temporal( TemporalType.TIMESTAMP )
	public Date getTheTimestamp() {
		return theTimestamp;
	}

	public void setTheTimestamp(Date theTimestamp) {
		this.theTimestamp = theTimestamp;
	}

	@Temporal( TemporalType.TIMESTAMP )
	public Instant getTheInstant() {
		return theInstant;
	}

	public void setTheInstant(Instant theInstant) {
		this.theInstant = theInstant;
	}

	public LocalDateTime getTheLocalDateTime() {
		return theLocalDateTime;
	}

	public void setTheLocalDateTime(LocalDateTime theLocalDateTime) {
		this.theLocalDateTime = theLocalDateTime;
	}

	public LocalDate getTheLocalDate() {
		return theLocalDate;
	}

	public void setTheLocalDate(LocalDate theLocalDate) {
		this.theLocalDate = theLocalDate;
	}

	public LocalTime getTheLocalTime() {
		return theLocalTime;
	}

	public void setTheLocalTime(LocalTime theLocalTime) {
		this.theLocalTime = theLocalTime;
	}

	public OffsetDateTime getTheOffsetDateTime() {
		return theOffsetDateTime;
	}

	public void setTheOffsetDateTime(OffsetDateTime theOffsetDateTime) {
		this.theOffsetDateTime = theOffsetDateTime;
	}

	public ZonedDateTime getTheZonedDateTime() {
		return theZonedDateTime;
	}

	public void setTheZonedDateTime(ZonedDateTime theZonedDateTime) {
		this.theZonedDateTime = theZonedDateTime;
	}

	public Duration getTheDuration() {
		return theDuration;
	}

	public void setTheDuration(Duration theDuration) {
		this.theDuration = theDuration;
	}

	public Boolean isTheBoolean() {
		return theBoolean;
	}

	public void setTheBoolean(Boolean theBoolean) {
		this.theBoolean = theBoolean;
	}

	public Boolean isTheNumericBoolean() {
		return theNumericBoolean;
	}

	public void setTheNumericBoolean(Boolean theNumericBoolean) {
		this.theNumericBoolean = theNumericBoolean;
	}

	public Boolean isTheStringBoolean() {
		return theStringBoolean;
	}

	public void setTheStringBoolean(Boolean theStringBoolean) {
		this.theStringBoolean = theStringBoolean;
	}

	public Boolean getTheBoolean2() {
		return theBoolean2;
	}

	public void setTheBoolean2(Boolean theBoolean2) {
		this.theBoolean2 = theBoolean2;
	}

	public Boolean getTheNumericBoolean2() {
		return theNumericBoolean2;
	}

	public void setTheNumericBoolean2(Boolean theNumericBoolean2) {
		this.theNumericBoolean2 = theNumericBoolean2;
	}

	public Boolean getTheStringBoolean2() {
		return theStringBoolean2;
	}

	public void setTheStringBoolean2(Boolean theStringBoolean2) {
		this.theStringBoolean2 = theStringBoolean2;
	}

	public String getTheString2() {
		return theString2;
	}

	public void setTheString2(String theString2) {
		this.theString2 = theString2;
	}

	public Integer getTheInteger2() {
		return theInteger2;
	}

	public void setTheInteger2(Integer theInteger2) {
		this.theInteger2 = theInteger2;
	}

	public int getTheInt2() {
		return theInt2;
	}

	public void setTheInt2(int theInt2) {
		this.theInt2 = theInt2;
	}

	public double getTheDouble2() {
		return theDouble2;
	}

	public void setTheDouble2(double theDouble2) {
		this.theDouble2 = theDouble2;
	}

	public URL getTheUrl2() {
		return theUrl2;
	}

	public void setTheUrl2(URL theUrl2) {
		this.theUrl2 = theUrl2;
	}

	public Date getTheDate2() {
		return theDate2;
	}

	public void setTheDate2(Date theDate2) {
		this.theDate2 = theDate2;
	}

	public Date getTheTime2() {
		return theTime2;
	}

	public void setTheTime2(Date theTime2) {
		this.theTime2 = theTime2;
	}

	public Date getTheTimestamp2() {
		return theTimestamp2;
	}

	public void setTheTimestamp2(Date theTimestamp2) {
		this.theTimestamp2 = theTimestamp2;
	}

	public Instant getTheInstant2() {
		return theInstant2;
	}

	public void setTheInstant2(Instant theInstant2) {
		this.theInstant2 = theInstant2;
	}

	public Gender getGender2() {
		return gender2;
	}

	public void setGender2(Gender gender2) {
		this.gender2 = gender2;
	}

	public Gender getSingleCharGender2() {
		return singleCharGender2;
	}

	public void setSingleCharGender2(Gender singleCharGender2) {
		this.singleCharGender2 = singleCharGender2;
	}

	public Gender getOrdinalGender2() {
		return ordinalGender2;
	}

	public void setOrdinalGender2(Gender ordinalGender2) {
		this.ordinalGender2 = ordinalGender2;
	}

	public Duration getTheDuration2() {
		return theDuration2;
	}

	public void setTheDuration2(Duration theDuration2) {
		this.theDuration2 = theDuration2;
	}

	public LocalDateTime getTheLocalDateTime2() {
		return theLocalDateTime2;
	}

	public void setTheLocalDateTime2(LocalDateTime theLocalDateTime2) {
		this.theLocalDateTime2 = theLocalDateTime2;
	}

	public LocalDate getTheLocalDate2() {
		return theLocalDate2;
	}

	public void setTheLocalDate2(LocalDate theLocalDate2) {
		this.theLocalDate2 = theLocalDate2;
	}

	public LocalTime getTheLocalTime2() {
		return theLocalTime2;
	}

	public void setTheLocalTime2(LocalTime theLocalTime2) {
		this.theLocalTime2 = theLocalTime2;
	}

	public ZonedDateTime getTheZonedDateTime2() {
		return theZonedDateTime2;
	}

	public void setTheZonedDateTime2(ZonedDateTime theZonedDateTime2) {
		this.theZonedDateTime2 = theZonedDateTime2;
	}

	public OffsetDateTime getTheOffsetDateTime2() {
		return theOffsetDateTime2;
	}

	public void setTheOffsetDateTime2(OffsetDateTime theOffsetDateTime2) {
		this.theOffsetDateTime2 = theOffsetDateTime2;
	}

	public void setTheBoolean3(Boolean theBoolean3) {
		this.theBoolean3 = theBoolean3;
	}

	public void setTheNumericBoolean3(Boolean theNumericBoolean3) {
		this.theNumericBoolean3 = theNumericBoolean3;
	}

	public void setTheStringBoolean3(Boolean theStringBoolean3) {
		this.theStringBoolean3 = theStringBoolean3;
	}

	public void setTheString3(String theString3) {
		this.theString3 = theString3;
	}

	public void setTheInteger3(Integer theInteger3) {
		this.theInteger3 = theInteger3;
	}

	public void setTheInt3(int theInt3) {
		this.theInt3 = theInt3;
	}

	public void setTheDouble3(double theDouble3) {
		this.theDouble3 = theDouble3;
	}

	public void setTheUrl3(URL theUrl3) {
		this.theUrl3 = theUrl3;
	}

	public void setTheDate3(Date theDate3) {
		this.theDate3 = theDate3;
	}

	public void setTheTime3(Date theTime3) {
		this.theTime3 = theTime3;
	}

	public void setTheTimestamp3(Date theTimestamp3) {
		this.theTimestamp3 = theTimestamp3;
	}

	public void setTheInstant3(Instant theInstant3) {
		this.theInstant3 = theInstant3;
	}

	public void setGender3(Gender gender3) {
		this.gender3 = gender3;
	}

	public void setSingleCharGender3(Gender singleCharGender3) {
		this.singleCharGender3 = singleCharGender3;
	}

	public void setOrdinalGender3(Gender ordinalGender3) {
		this.ordinalGender3 = ordinalGender3;
	}

	public void setTheDuration3(Duration theDuration3) {
		this.theDuration3 = theDuration3;
	}

	public void setTheLocalDateTime3(LocalDateTime theLocalDateTime3) {
		this.theLocalDateTime3 = theLocalDateTime3;
	}

	public void setTheLocalDate3(LocalDate theLocalDate3) {
		this.theLocalDate3 = theLocalDate3;
	}

	public void setTheLocalTime3(LocalTime theLocalTime3) {
		this.theLocalTime3 = theLocalTime3;
	}

	public void setTheZonedDateTime3(ZonedDateTime theZonedDateTime3) {
		this.theZonedDateTime3 = theZonedDateTime3;
	}

	public void setTheOffsetDateTime3(OffsetDateTime theOffsetDateTime3) {
		this.theOffsetDateTime3 = theOffsetDateTime3;
	}

	public void setTheBoolean4(Boolean theBoolean4) {
		this.theBoolean4 = theBoolean4;
	}

	public void setTheNumericBoolean4(Boolean theNumericBoolean4) {
		this.theNumericBoolean4 = theNumericBoolean4;
	}

	public void setTheStringBoolean4(Boolean theStringBoolean4) {
		this.theStringBoolean4 = theStringBoolean4;
	}

	public void setTheString4(String theString4) {
		this.theString4 = theString4;
	}

	public void setTheInteger4(Integer theInteger4) {
		this.theInteger4 = theInteger4;
	}

	public void setTheInt4(int theInt4) {
		this.theInt4 = theInt4;
	}

	public void setTheDouble4(double theDouble4) {
		this.theDouble4 = theDouble4;
	}

	public void setTheUrl4(URL theUrl4) {
		this.theUrl4 = theUrl4;
	}

	public void setTheDate4(Date theDate4) {
		this.theDate4 = theDate4;
	}

	public void setTheTime4(Date theTime4) {
		this.theTime4 = theTime4;
	}

	public void setTheTimestamp4(Date theTimestamp4) {
		this.theTimestamp4 = theTimestamp4;
	}

	public void setTheInstant4(Instant theInstant4) {
		this.theInstant4 = theInstant4;
	}

	public void setGender4(Gender gender4) {
		this.gender4 = gender4;
	}

	public void setSingleCharGender4(Gender singleCharGender4) {
		this.singleCharGender4 = singleCharGender4;
	}

	public void setOrdinalGender4(Gender ordinalGender4) {
		this.ordinalGender4 = ordinalGender4;
	}

	public void setTheDuration4(Duration theDuration4) {
		this.theDuration4 = theDuration4;
	}

	public void setTheLocalDateTime4(LocalDateTime theLocalDateTime4) {
		this.theLocalDateTime4 = theLocalDateTime4;
	}

	public void setTheLocalDate4(LocalDate theLocalDate4) {
		this.theLocalDate4 = theLocalDate4;
	}

	public void setTheLocalTime4(LocalTime theLocalTime4) {
		this.theLocalTime4 = theLocalTime4;
	}

	public void setTheZonedDateTime4(ZonedDateTime theZonedDateTime4) {
		this.theZonedDateTime4 = theZonedDateTime4;
	}

	public void setTheOffsetDateTime4(OffsetDateTime theOffsetDateTime4) {
		this.theOffsetDateTime4 = theOffsetDateTime4;
	}

	public void setTheBoolean5(Boolean theBoolean5) {
		this.theBoolean5 = theBoolean5;
	}

	public void setTheNumericBoolean5(Boolean theNumericBoolean5) {
		this.theNumericBoolean5 = theNumericBoolean5;
	}

	public void setTheStringBoolean5(Boolean theStringBoolean5) {
		this.theStringBoolean5 = theStringBoolean5;
	}

	public void setTheString5(String theString5) {
		this.theString5 = theString5;
	}

	public void setTheInteger5(Integer theInteger5) {
		this.theInteger5 = theInteger5;
	}

	public void setTheInt5(int theInt5) {
		this.theInt5 = theInt5;
	}

	public void setTheDouble5(double theDouble5) {
		this.theDouble5 = theDouble5;
	}

	public void setTheUrl5(URL theUrl5) {
		this.theUrl5 = theUrl5;
	}

	public void setTheDate5(Date theDate5) {
		this.theDate5 = theDate5;
	}

	public void setTheTime5(Date theTime5) {
		this.theTime5 = theTime5;
	}

	public void setTheTimestamp5(Date theTimestamp5) {
		this.theTimestamp5 = theTimestamp5;
	}

	public void setTheInstant5(Instant theInstant5) {
		this.theInstant5 = theInstant5;
	}

	public void setGender5(Gender gender5) {
		this.gender5 = gender5;
	}

	public void setSingleCharGender5(Gender singleCharGender5) {
		this.singleCharGender5 = singleCharGender5;
	}

	public void setOrdinalGender5(Gender ordinalGender5) {
		this.ordinalGender5 = ordinalGender5;
	}

	public void setTheDuration5(Duration theDuration5) {
		this.theDuration5 = theDuration5;
	}

	public void setTheLocalDateTime5(LocalDateTime theLocalDateTime5) {
		this.theLocalDateTime5 = theLocalDateTime5;
	}

	public void setTheLocalDate5(LocalDate theLocalDate5) {
		this.theLocalDate5 = theLocalDate5;
	}

	public void setTheLocalTime5(LocalTime theLocalTime5) {
		this.theLocalTime5 = theLocalTime5;
	}

	public void setTheZonedDateTime5(ZonedDateTime theZonedDateTime5) {
		this.theZonedDateTime5 = theZonedDateTime5;
	}

	public void setTheOffsetDateTime5(OffsetDateTime theOffsetDateTime5) {
		this.theOffsetDateTime5 = theOffsetDateTime5;
	}
}
