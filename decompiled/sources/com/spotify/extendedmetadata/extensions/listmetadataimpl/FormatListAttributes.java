package com.spotify.extendedmetadata.extensions.listmetadataimpl;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.byy;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t300;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class FormatListAttributes extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 1;
    private static final FormatListAttributes DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ihc0 attributes_ = ihc0.f102235b;

    static {
        FormatListAttributes formatListAttributes = new FormatListAttributes();
        DEFAULT_INSTANCE = formatListAttributes;
        AbstractC0269h.registerDefaultInstance(FormatListAttributes.class, formatListAttributes);
    }

    private FormatListAttributes() {
    }

    /* JADX INFO: renamed from: p */
    public static FormatListAttributes m10198p() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"attributes_", t300.f216684a});
        }
        if (iOrdinal == 3) {
            return new FormatListAttributes();
        }
        if (iOrdinal == 4) {
            return new byy(20);
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
        synchronized (FormatListAttributes.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Map m10199o() {
        return Collections.unmodifiableMap(this.attributes_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
