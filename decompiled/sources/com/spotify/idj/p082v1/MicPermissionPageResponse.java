package com.spotify.idj.p082v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x5f0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class MicPermissionPageResponse extends AbstractC0269h implements sre0 {
    public static final int BODY_SECTIONS_FIELD_NUMBER = 3;
    public static final int CANCEL_BUTTON_LOCALIZED_TEXT_FIELD_NUMBER = 5;
    public static final int CONFIRM_BUTTON_LOCALIZED_TEXT_FIELD_NUMBER = 4;
    public static final int CONTENT_TITLE_LOCALIZED_TEXT_FIELD_NUMBER = 2;
    private static final MicPermissionPageResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TOP_IMAGE_URI_FIELD_NUMBER = 1;
    private String topImageUri_ = "";
    private String contentTitleLocalizedText_ = "";
    private ae50 bodySections_ = AbstractC0269h.emptyProtobufList();
    private String confirmButtonLocalizedText_ = "";
    private String cancelButtonLocalizedText_ = "";

    static {
        MicPermissionPageResponse micPermissionPageResponse = new MicPermissionPageResponse();
        DEFAULT_INSTANCE = micPermissionPageResponse;
        AbstractC0269h.registerDefaultInstance(MicPermissionPageResponse.class, micPermissionPageResponse);
    }

    private MicPermissionPageResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005Ȉ", new Object[]{"topImageUri_", "contentTitleLocalizedText_", "bodySections_", BodySection.class, "confirmButtonLocalizedText_", "cancelButtonLocalizedText_"});
        }
        if (iOrdinal == 3) {
            return new MicPermissionPageResponse();
        }
        if (iOrdinal == 4) {
            return new x5f0(DEFAULT_INSTANCE, 19);
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
        synchronized (MicPermissionPageResponse.class) {
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
    public final ae50 m11991n() {
        return this.bodySections_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m11992o() {
        return this.cancelButtonLocalizedText_;
    }

    /* JADX INFO: renamed from: p */
    public final String m11993p() {
        return this.confirmButtonLocalizedText_;
    }

    /* JADX INFO: renamed from: q */
    public final String m11994q() {
        return this.contentTitleLocalizedText_;
    }

    /* JADX INFO: renamed from: r */
    public final String m11995r() {
        return this.topImageUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
