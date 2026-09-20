package com.spotify.subscriptionviewservice.p161v1;

import com.google.protobuf.AbstractC0269h;
import p204p.k810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GetPageResponse extends AbstractC0269h implements sre0 {
    private static final GetPageResponse DEFAULT_INSTANCE;
    public static final int PAGE_TITLE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SECTIONED_FIELD_NUMBER = 2;
    public static final int TABBED_FIELD_NUMBER = 3;
    private Object layout_;
    private int layoutCase_ = 0;
    private String pageTitle_ = "";

    static {
        GetPageResponse getPageResponse = new GetPageResponse();
        DEFAULT_INSTANCE = getPageResponse;
        AbstractC0269h.registerDefaultInstance(GetPageResponse.class, getPageResponse);
    }

    private GetPageResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"layout_", "layoutCase_", "pageTitle_", SectionedLayout.class, TabbedLayout.class});
        }
        if (iOrdinal == 3) {
            return new GetPageResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 27);
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
        synchronized (GetPageResponse.class) {
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
    public final int m21748n() {
        int i = this.layoutCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m21749o() {
        return this.pageTitle_;
    }

    /* JADX INFO: renamed from: p */
    public final SectionedLayout m21750p() {
        return this.layoutCase_ == 2 ? (SectionedLayout) this.layout_ : SectionedLayout.m21764n();
    }

    /* JADX INFO: renamed from: q */
    public final TabbedLayout m21751q() {
        return this.layoutCase_ == 3 ? (TabbedLayout) this.layout_ : TabbedLayout.m21781n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
