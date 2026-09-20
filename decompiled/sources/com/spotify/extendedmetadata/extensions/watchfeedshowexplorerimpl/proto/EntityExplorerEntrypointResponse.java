package com.spotify.extendedmetadata.extensions.watchfeedshowexplorerimpl.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeedextensions.component.item.p192v1.EntityExplorerButtonComponent;
import com.spotify.watchfeedextensions.component.item.p192v1.EntityExplorerHeaderComponent;
import com.spotify.watchfeedextensions.component.item.p192v1.InlineEntityExplorerRowComponent;
import com.spotify.watchfeedextensions.component.item.p192v1.PlaylistExplorerButtonComponent;
import com.spotify.watchfeedextensions.component.item.p192v1.PlaylistExplorerCardComponent;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes6.dex */
public final class EntityExplorerEntrypointResponse extends AbstractC0269h implements sre0 {
    private static final EntityExplorerEntrypointResponse DEFAULT_INSTANCE;
    public static final int ENTITY_EXPLORER_BUTTON_FIELD_NUMBER = 3;
    public static final int ENTITY_EXPLORER_HEADER_FIELD_NUMBER = 4;
    public static final int INLINE_ENTITY_EXPLORER_ROW_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_EXPLORER_BUTTON_FIELD_NUMBER = 2;
    public static final int PLAYLIST_EXPLORER_CARD_FIELD_NUMBER = 1;
    private int payloadCase_ = 0;
    private Object payload_;

    static {
        EntityExplorerEntrypointResponse entityExplorerEntrypointResponse = new EntityExplorerEntrypointResponse();
        DEFAULT_INSTANCE = entityExplorerEntrypointResponse;
        AbstractC0269h.registerDefaultInstance(EntityExplorerEntrypointResponse.class, entityExplorerEntrypointResponse);
    }

    private EntityExplorerEntrypointResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: x */
    public static EntityExplorerEntrypointResponse m10517x(byte[] bArr) {
        return (EntityExplorerEntrypointResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"payload_", "payloadCase_", PlaylistExplorerCardComponent.class, PlaylistExplorerButtonComponent.class, EntityExplorerButtonComponent.class, EntityExplorerHeaderComponent.class, InlineEntityExplorerRowComponent.class});
        }
        if (iOrdinal == 3) {
            return new EntityExplorerEntrypointResponse();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 23);
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
        synchronized (EntityExplorerEntrypointResponse.class) {
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
    public final EntityExplorerButtonComponent m10518n() {
        return this.payloadCase_ == 3 ? (EntityExplorerButtonComponent) this.payload_ : EntityExplorerButtonComponent.m23004o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EntityExplorerHeaderComponent m10519o() {
        return this.payloadCase_ == 4 ? (EntityExplorerHeaderComponent) this.payload_ : EntityExplorerHeaderComponent.m23012n();
    }

    /* JADX INFO: renamed from: p */
    public final InlineEntityExplorerRowComponent m10520p() {
        return this.payloadCase_ == 5 ? (InlineEntityExplorerRowComponent) this.payload_ : InlineEntityExplorerRowComponent.m23014o();
    }

    /* JADX INFO: renamed from: q */
    public final PlaylistExplorerButtonComponent m10521q() {
        return this.payloadCase_ == 2 ? (PlaylistExplorerButtonComponent) this.payload_ : PlaylistExplorerButtonComponent.m23021o();
    }

    /* JADX INFO: renamed from: r */
    public final PlaylistExplorerCardComponent m10522r() {
        return this.payloadCase_ == 1 ? (PlaylistExplorerCardComponent) this.payload_ : PlaylistExplorerCardComponent.m23024o();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m10523s() {
        return this.payloadCase_ == 3;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m10524t() {
        return this.payloadCase_ == 4;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10525u() {
        return this.payloadCase_ == 5;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10526v() {
        return this.payloadCase_ == 2;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m10527w() {
        return this.payloadCase_ == 1;
    }
}
