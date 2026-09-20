package com.spotify.featuregate.p068v1;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.mlx;
import p204p.ney;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class FeatureAccessResponse extends AbstractC0269h implements sre0 {
    public static final int ACCESS_FIELD_NUMBER = 1;
    private static final FeatureAccessResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ihc0 access_ = ihc0.f102235b;

    static {
        FeatureAccessResponse featureAccessResponse = new FeatureAccessResponse();
        DEFAULT_INSTANCE = featureAccessResponse;
        AbstractC0269h.registerDefaultInstance(FeatureAccessResponse.class, featureAccessResponse);
    }

    private FeatureAccessResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static FeatureAccessResponse m10961o(byte[] bArr) {
        return (FeatureAccessResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"access_", ney.f153156a});
        }
        if (iOrdinal == 3) {
            return new FeatureAccessResponse();
        }
        if (iOrdinal == 4) {
            return new mlx(DEFAULT_INSTANCE, 14);
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
        synchronized (FeatureAccessResponse.class) {
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
    public final Map m10962n() {
        return Collections.unmodifiableMap(this.access_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
