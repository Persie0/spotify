package com.spotify.extendedmetadata.extensions.trackdescriptorimpl;

import com.google.protobuf.AbstractC0269h;
import p204p.mlx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uc5;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ExtensionDescriptor extends AbstractC0269h implements sre0 {
    public static final int CONCEPT_URI_FIELD_NUMBER = 4;
    private static final ExtensionDescriptor DEFAULT_INSTANCE;
    public static final int LOCALIZED_TERM_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TYPES_FIELD_NUMBER = 3;
    public static final int WEIGHT_FIELD_NUMBER = 2;
    private static final vd50 types_converter_ = new uc5(11);
    private int typesMemoizedSerializedSize;
    private float weight_;
    private String text_ = "";
    private ud50 types_ = AbstractC0269h.emptyIntList();
    private String conceptUri_ = "";
    private String localizedTerm_ = "";

    static {
        ExtensionDescriptor extensionDescriptor = new ExtensionDescriptor();
        DEFAULT_INSTANCE = extensionDescriptor;
        AbstractC0269h.registerDefaultInstance(ExtensionDescriptor.class, extensionDescriptor);
    }

    private ExtensionDescriptor() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\u0001\u0003,\u0004Ȉ\u0005Ȉ", new Object[]{"text_", "weight_", "types_", "conceptUri_", "localizedTerm_"});
        }
        if (iOrdinal == 3) {
            return new ExtensionDescriptor();
        }
        if (iOrdinal == 4) {
            return new mlx(DEFAULT_INSTANCE, 6);
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
        synchronized (ExtensionDescriptor.class) {
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

    public final float getWeight() {
        return this.weight_;
    }

    /* JADX INFO: renamed from: n */
    public final String m10488n() {
        return this.conceptUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10489o() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
