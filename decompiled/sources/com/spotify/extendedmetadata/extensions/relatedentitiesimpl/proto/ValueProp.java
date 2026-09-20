package com.spotify.extendedmetadata.extensions.relatedentitiesimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h2b1;
import p204p.o2w;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vm11;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ValueProp extends AbstractC0269h implements sre0 {
    private static final ValueProp DEFAULT_INSTANCE;
    public static final int EPISODE_VALUE_PROP_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_VALUE_PROP_FIELD_NUMBER = 2;
    private int valuePropTypeCase_ = 0;
    private Object valuePropType_;

    static {
        ValueProp valueProp = new ValueProp();
        DEFAULT_INSTANCE = valueProp;
        AbstractC0269h.registerDefaultInstance(ValueProp.class, valueProp);
    }

    private ValueProp() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000", new Object[]{"valuePropType_", "valuePropTypeCase_"});
        }
        if (iOrdinal == 3) {
            return new ValueProp();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 3);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (ValueProp.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX INFO: renamed from: n */
    public final o2w m10364n() {
        int i = this.valuePropTypeCase_;
        o2w o2wVar = o2w.EPISODE_GATED_VALUE_PROP_UNKNOWN;
        if (i == 1) {
            switch (((Integer) this.valuePropType_).intValue()) {
                case 0:
                    break;
                case 1:
                    o2wVar = o2w.EPISODE_GATED_VALUE_PROP_UNSPECIFIED;
                    break;
                case 2:
                    o2wVar = o2w.EPISODE_GATED_VALUE_PROP_AD_FREE;
                    break;
                case 3:
                    o2wVar = o2w.EPISODE_GATED_VALUE_PROP_EXTENDED;
                    break;
                case 4:
                    o2wVar = o2w.EPISODE_GATED_VALUE_PROP_EARLY_ACCESS;
                    break;
                case 5:
                    o2wVar = o2w.EPISODE_GATED_VALUE_PROP_VIDEO;
                    break;
                case 6:
                    o2wVar = o2w.EPISODE_GATED_VALUE_PROP_FULL_LENGTH_EPISODES;
                    break;
                case 7:
                    o2wVar = o2w.EPISODE_GATED_VALUE_PROP_NONE;
                    break;
                default:
                    o2wVar = null;
                    break;
            }
            if (o2wVar == null) {
                return o2w.UNRECOGNIZED;
            }
        }
        return o2wVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final vm11 m10365o() {
        int i = this.valuePropTypeCase_;
        vm11 vm11Var = vm11.SHOW_GATED_VALUE_PROP_UNKNOWN;
        if (i == 2) {
            switch (((Integer) this.valuePropType_).intValue()) {
                case 0:
                    break;
                case 1:
                    vm11Var = vm11.SHOW_GATED_VALUE_PROP_UNSPECIFIED;
                    break;
                case 2:
                    vm11Var = vm11.SHOW_GATED_VALUE_PROP_AD_FREE;
                    break;
                case 3:
                    vm11Var = vm11.SHOW_GATED_VALUE_PROP_EXTENDED;
                    break;
                case 4:
                    vm11Var = vm11.SHOW_GATED_VALUE_PROP_EARLY_ACCESS;
                    break;
                case 5:
                    vm11Var = vm11.SHOW_GATED_VALUE_PROP_VIDEO;
                    break;
                case 6:
                    vm11Var = vm11.SHOW_GATED_VALUE_PROP_FULL_LENGTH_EPISODES;
                    break;
                case 7:
                    vm11Var = vm11.SHOW_GATED_VALUE_PROP_BONUS;
                    break;
                default:
                    vm11Var = null;
                    break;
            }
            if (vm11Var == null) {
                return vm11.UNRECOGNIZED;
            }
        }
        return vm11Var;
    }

    /* JADX INFO: renamed from: p */
    public final int m10366p() {
        int i = this.valuePropTypeCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
