package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.g6f0;
import p204p.gtb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t46;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Capabilities extends AbstractC0269h implements sre0 {
    public static final int ADMINISTRATE_PERMISSION_KIND_CAPABILITIES_FIELD_NUMBER = 12;
    public static final int ATTRIBUTE_KIND_CAPABILITIES_FIELD_NUMBER = 9;
    public static final int CAN_ABUSE_REPORT_FIELD_NUMBER = 14;
    public static final int CAN_ADD_PROMPT_FIELD_NUMBER = 20;
    public static final int CAN_ADMINISTRATE_PERMISSIONS_FIELD_NUMBER = 2;
    public static final int CAN_CANCEL_MEMBERSHIP_FIELD_NUMBER = 6;
    public static final int CAN_DELETE_FIELD_NUMBER = 13;
    public static final int CAN_EDIT_ITEMS_FIELD_NUMBER = 5;
    public static final int CAN_EDIT_METADATA_FIELD_NUMBER = 4;
    public static final int CAN_EDIT_PROMPT_FIELD_NUMBER = 19;
    public static final int CAN_MIX_PLAYLIST_FIELD_NUMBER = 10;
    public static final int CAN_MODIFY_SPEED_PLAYLIST_FIELD_NUMBER = 17;
    public static final int CAN_PUBLISH_TO_PROFILE_FIELD_NUMBER = 15;
    public static final int CAN_SEND_MESSAGES_FIELD_NUMBER = 11;
    public static final int CAN_VIEW_FIELD_NUMBER = 1;
    private static final Capabilities DEFAULT_INSTANCE;
    public static final int GRANTABLE_LEVELS_FIELD_NUMBER = 7;
    public static final int GRANTABLE_LEVEL_FIELD_NUMBER = 3;
    public static final int LIST_ATTRIBUTE_CAPABILITIES_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER;
    private static final vd50 grantableLevel_converter_ = new t46(2);
    private AdministratePermissionKindCapabilities administratePermissionKindCapabilities_;
    private int bitField0_;
    private boolean canAbuseReport_;
    private boolean canAddPrompt_;
    private boolean canAdministratePermissions_;
    private boolean canCancelMembership_;
    private boolean canDelete_;
    private boolean canEditItems_;
    private boolean canEditMetadata_;
    private boolean canEditPrompt_;
    private boolean canMixPlaylist_;
    private boolean canModifySpeedPlaylist_;
    private boolean canPublishToProfile_;
    private boolean canSendMessages_;
    private boolean canView_;
    private GrantableLevels grantableLevels_;
    private ListAttributeCapabilities listAttributeCapabilities_;
    private ud50 grantableLevel_ = AbstractC0269h.emptyIntList();
    private ae50 attributeKindCapabilities_ = AbstractC0269h.emptyProtobufList();

    static {
        Capabilities capabilities = new Capabilities();
        DEFAULT_INSTANCE = capabilities;
        AbstractC0269h.registerDefaultInstance(Capabilities.class, capabilities);
    }

    private Capabilities() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: w */
    public static Capabilities m18456w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static gtb m18457z(Capabilities capabilities) {
        return (gtb) DEFAULT_INSTANCE.createBuilder(capabilities);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0002\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ࠞ\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဉ\u0005\bဉ\u0006\t\u001b\nဇ\u0007\u000bဇ\b\fဉ\t\rဇ\n\u000eဇ\u000b\u000fဇ\f\u0011ဇ\r\u0013ဇ\u000e\u0014ဇ\u000f", new Object[]{"bitField0_", "canView_", "canAdministratePermissions_", "grantableLevel_", g6f0.f77035h, "canEditMetadata_", "canEditItems_", "canCancelMembership_", "grantableLevels_", "listAttributeCapabilities_", "attributeKindCapabilities_", AttributeKindCapabilities.class, "canMixPlaylist_", "canSendMessages_", "administratePermissionKindCapabilities_", "canDelete_", "canAbuseReport_", "canPublishToProfile_", "canModifySpeedPlaylist_", "canEditPrompt_", "canAddPrompt_"});
        }
        if (iOrdinal == 3) {
            return new Capabilities();
        }
        if (iOrdinal == 4) {
            return new gtb();
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
        synchronized (Capabilities.class) {
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
    public final boolean m18458o() {
        return this.canAddPrompt_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m18459p() {
        return this.canAdministratePermissions_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m18460q() {
        return this.canCancelMembership_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m18461r() {
        return this.canDelete_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m18462s() {
        return this.canEditItems_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m18463t() {
        return this.canEditPrompt_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m18464u() {
        return this.canMixPlaylist_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m18465v() {
        return this.canModifySpeedPlaylist_;
    }

    /* JADX INFO: renamed from: x */
    public final GrantableLevels m18466x() {
        GrantableLevels grantableLevels = this.grantableLevels_;
        return grantableLevels == null ? GrantableLevels.m18476o() : grantableLevels;
    }

    /* JADX INFO: renamed from: y */
    public final ListAttributeCapabilities m18467y() {
        ListAttributeCapabilities listAttributeCapabilities = this.listAttributeCapabilities_;
        return listAttributeCapabilities == null ? ListAttributeCapabilities.m18479n() : listAttributeCapabilities;
    }
}
