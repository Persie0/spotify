package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public interface VisibilityChecker<T extends VisibilityChecker<T>> {

    public static class Std implements VisibilityChecker<Std>, Serializable {
        protected static final Std ALL_PUBLIC;
        protected static final Std DEFAULT;
        protected final JsonAutoDetect$Visibility _creatorMinLevel;
        protected final JsonAutoDetect$Visibility _fieldMinLevel;
        protected final JsonAutoDetect$Visibility _getterMinLevel;
        protected final JsonAutoDetect$Visibility _isGetterMinLevel;
        protected final JsonAutoDetect$Visibility _setterMinLevel;

        static {
            JsonAutoDetect$Visibility jsonAutoDetect$Visibility = JsonAutoDetect$Visibility.PUBLIC_ONLY;
            JsonAutoDetect$Visibility jsonAutoDetect$Visibility2 = JsonAutoDetect$Visibility.ANY;
            DEFAULT = new Std(jsonAutoDetect$Visibility, jsonAutoDetect$Visibility, jsonAutoDetect$Visibility2, jsonAutoDetect$Visibility2, jsonAutoDetect$Visibility);
            ALL_PUBLIC = new Std(jsonAutoDetect$Visibility, jsonAutoDetect$Visibility, jsonAutoDetect$Visibility, jsonAutoDetect$Visibility, jsonAutoDetect$Visibility);
        }

        public Std(JsonAutoDetect$Visibility jsonAutoDetect$Visibility, JsonAutoDetect$Visibility jsonAutoDetect$Visibility2, JsonAutoDetect$Visibility jsonAutoDetect$Visibility3, JsonAutoDetect$Visibility jsonAutoDetect$Visibility4, JsonAutoDetect$Visibility jsonAutoDetect$Visibility5) {
            this._getterMinLevel = jsonAutoDetect$Visibility;
            this._isGetterMinLevel = jsonAutoDetect$Visibility2;
            this._setterMinLevel = jsonAutoDetect$Visibility3;
            this._creatorMinLevel = jsonAutoDetect$Visibility4;
            this._fieldMinLevel = jsonAutoDetect$Visibility5;
        }

        public static Std defaultInstance() {
            return DEFAULT;
        }

        public String toString() {
            return "[Visibility: getter=" + this._getterMinLevel + ",isGetter=" + this._isGetterMinLevel + ",setter=" + this._setterMinLevel + ",creator=" + this._creatorMinLevel + ",field=" + this._fieldMinLevel + "]";
        }
    }
}
