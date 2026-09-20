package com.spotify.addonconsideration.p011v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class GetAddonConsiderationResponse extends AbstractC0269h implements sre0 {
    private static final GetAddonConsiderationResponse DEFAULT_INSTANCE;
    public static final int PAGE_TITLE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SHOWCASE_LAYOUT_FIELD_NUMBER = 2;
    private Object layout_;
    private int layoutCase_ = 0;
    private String pageTitle_ = "";

    static {
        GetAddonConsiderationResponse getAddonConsiderationResponse = new GetAddonConsiderationResponse();
        DEFAULT_INSTANCE = getAddonConsiderationResponse;
        AbstractC0269h.registerDefaultInstance(GetAddonConsiderationResponse.class, getAddonConsiderationResponse);
    }

    private GetAddonConsiderationResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"layout_", "layoutCase_", "pageTitle_", ShowcaseLayout.class});
        }
        if (iOrdinal == 3) {
            return new GetAddonConsiderationResponse();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 24);
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
        synchronized (GetAddonConsiderationResponse.class) {
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
    public final int m2322n() {
        int i = this.layoutCase_;
        if (i != 0) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ShowcaseLayout m2323o() {
        return this.layoutCase_ == 2 ? (ShowcaseLayout) this.layout_ : ShowcaseLayout.m2335n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
