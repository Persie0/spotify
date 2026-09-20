package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

/* JADX WARN: Method from annotation default annotation not found: lenient */
/* JADX WARN: Method from annotation default annotation not found: locale */
/* JADX WARN: Method from annotation default annotation not found: pattern */
/* JADX WARN: Method from annotation default annotation not found: shape */
/* JADX WARN: Method from annotation default annotation not found: timezone */
/* JADX WARN: Method from annotation default annotation not found: with */
/* JADX WARN: Method from annotation default annotation not found: without */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonFormat {

    public static class Features {
        private static final Features EMPTY = new Features(0, 0);
        private final int _disabled;
        private final int _enabled;

        private Features(int i, int i2) {
            this._enabled = i;
            this._disabled = i2;
        }

        public static Features empty() {
            return EMPTY;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Features features = (Features) obj;
            return features._enabled == this._enabled && features._disabled == this._disabled;
        }

        public int hashCode() {
            return this._disabled + this._enabled;
        }

        public String toString() {
            return this == EMPTY ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this._enabled), Integer.valueOf(this._disabled));
        }
    }

    public enum Shape {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY
    }

    public static class Value implements Serializable {
        private static final Value EMPTY = new Value();
        private final Features _features;
        private final Boolean _lenient;
        private final Locale _locale;
        private final String _pattern;
        private final Shape _shape;
        private transient TimeZone _timezone;
        private final String _timezoneStr;

        public Value() {
            this("", Shape.ANY, "", "", Features.empty(), null);
        }

        private static <T> boolean _equal(T t, T t2) {
            if (t == null) {
                return t2 == null;
            }
            if (t2 == null) {
                return false;
            }
            return t.equals(t2);
        }

        public static final Value empty() {
            return EMPTY;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            return this._shape == value._shape && this._features.equals(value._features) && _equal(this._lenient, value._lenient) && _equal(this._timezoneStr, value._timezoneStr) && _equal(this._pattern, value._pattern) && _equal(this._timezone, value._timezone) && _equal(this._locale, value._locale);
        }

        public int hashCode() {
            String str = this._timezoneStr;
            int iHashCode = str == null ? 1 : str.hashCode();
            String str2 = this._pattern;
            if (str2 != null) {
                iHashCode ^= str2.hashCode();
            }
            int iHashCode2 = this._shape.hashCode() + iHashCode;
            Boolean bool = this._lenient;
            if (bool != null) {
                iHashCode2 ^= bool.hashCode();
            }
            Locale locale = this._locale;
            if (locale != null) {
                iHashCode2 += locale.hashCode();
            }
            return this._features.hashCode() ^ iHashCode2;
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this._pattern, this._shape, this._lenient, this._locale, this._timezoneStr, this._features);
        }

        public Value(String str, Shape shape, String str2, String str3, Features features, Boolean bool) {
            this(str, shape, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, features, bool);
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, Features features, Boolean bool) {
            this._pattern = str == null ? "" : str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this._timezone = timeZone;
            this._timezoneStr = str2;
            this._features = features == null ? Features.empty() : features;
            this._lenient = bool;
        }
    }
}
