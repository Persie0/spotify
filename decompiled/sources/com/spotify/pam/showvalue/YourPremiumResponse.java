package com.spotify.pam.showvalue;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.ose1;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class YourPremiumResponse extends AbstractC0269h implements sre0 {
    private static final YourPremiumResponse DEFAULT_INSTANCE;
    public static final int PAGE_SUBTITLE_FIELD_NUMBER = 2;
    public static final int PAGE_TITLE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SECTIONS_FIELD_NUMBER = 3;
    private String pageTitle_ = "";
    private String pageSubtitle_ = "";
    private ae50 sections_ = AbstractC0269h.emptyProtobufList();

    static {
        YourPremiumResponse yourPremiumResponse = new YourPremiumResponse();
        DEFAULT_INSTANCE = yourPremiumResponse;
        AbstractC0269h.registerDefaultInstance(YourPremiumResponse.class, yourPremiumResponse);
    }

    private YourPremiumResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"pageTitle_", "pageSubtitle_", "sections_", Section.class});
        }
        if (iOrdinal == 3) {
            return new YourPremiumResponse();
        }
        if (iOrdinal == 4) {
            return new ose1(DEFAULT_INSTANCE, 1);
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
        synchronized (YourPremiumResponse.class) {
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
    public final String m16357n() {
        return this.pageSubtitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16358o() {
        return this.pageTitle_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m16359p() {
        return this.sections_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
