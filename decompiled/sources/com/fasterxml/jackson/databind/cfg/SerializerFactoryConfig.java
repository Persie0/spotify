package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SerializerFactoryConfig implements Serializable {
    protected final Serializers[] _additionalKeySerializers;
    protected final Serializers[] _additionalSerializers;
    protected final BeanSerializerModifier[] _modifiers;
    protected static final Serializers[] NO_SERIALIZERS = new Serializers[0];
    protected static final BeanSerializerModifier[] NO_MODIFIERS = new BeanSerializerModifier[0];

    public SerializerFactoryConfig() {
        this(null, null, null);
    }

    public SerializerFactoryConfig(Serializers[] serializersArr, Serializers[] serializersArr2, BeanSerializerModifier[] beanSerializerModifierArr) {
        this._additionalSerializers = serializersArr == null ? NO_SERIALIZERS : serializersArr;
        this._additionalKeySerializers = serializersArr2 == null ? NO_SERIALIZERS : serializersArr2;
        this._modifiers = beanSerializerModifierArr == null ? NO_MODIFIERS : beanSerializerModifierArr;
    }
}
