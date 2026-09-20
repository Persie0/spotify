package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.iu0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class AddToCollectionButtonComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_ADDED_TEXT_FIELD_NUMBER = 3;
    public static final int ACCESSIBILITY_NOT_ADDED_TEXT_FIELD_NUMBER = 2;
    private static final AddToCollectionButtonComponent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_OVERRIDE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private String accessibilityNotAddedText_ = "";
    private String accessibilityAddedText_ = "";
    private String playlistUriOverride_ = "";

    static {
        AddToCollectionButtonComponent addToCollectionButtonComponent = new AddToCollectionButtonComponent();
        DEFAULT_INSTANCE = addToCollectionButtonComponent;
        AbstractC0269h.registerDefaultInstance(AddToCollectionButtonComponent.class, addToCollectionButtonComponent);
    }

    private AddToCollectionButtonComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static AddToCollectionButtonComponent m22562q(gva gvaVar) {
        return (AddToCollectionButtonComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"uri_", "accessibilityNotAddedText_", "accessibilityAddedText_", "playlistUriOverride_"});
        }
        if (iOrdinal == 3) {
            return new AddToCollectionButtonComponent();
        }
        if (iOrdinal == 4) {
            return new iu0(DEFAULT_INSTANCE, 7);
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
        synchronized (AddToCollectionButtonComponent.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22563n() {
        return this.accessibilityAddedText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22564o() {
        return this.accessibilityNotAddedText_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22565p() {
        return this.playlistUriOverride_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
