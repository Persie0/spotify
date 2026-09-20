package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.dti;
import p204p.iti;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectMessages$StateResponse extends AbstractC0269h implements sre0 {
    private static final ConnectMessages$StateResponse DEFAULT_INSTANCE;
    public static final int DEVICES_FIELD_NUMBER = 5;
    public static final int IS_ACTIVE_FIELD_NUMBER = 6;
    public static final int IS_ACTIVE_ON_SAME_DEVICE_FIELD_NUMBER = 7;
    public static final int IS_CONNECTED_FIELD_NUMBER = 2;
    public static final int IS_RUNNING_FIELD_NUMBER = 1;
    public static final int IS_SYNCED_WITH_BACKEND_FIELD_NUMBER = 8;
    public static final int LOCAL_NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SHOULD_USE_LOCAL_PLAYBACK_FIELD_NUMBER = 4;
    private boolean isActiveOnSameDevice_;
    private boolean isActive_;
    private boolean isConnected_;
    private boolean isRunning_;
    private boolean isSyncedWithBackend_;
    private boolean shouldUseLocalPlayback_;
    private String localName_ = "";
    private ae50 devices_ = AbstractC0269h.emptyProtobufList();

    public static final class Device extends AbstractC0269h implements sre0 {
        public static final int ALIAS_ID_FIELD_NUMBER = 35;
        public static final int BRAND_DISPLAY_NAME_FIELD_NUMBER = 30;
        public static final int CAPABILITIES_FIELD_NUMBER = 33;
        public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 4;
        public static final int CREATION_TIME_MS_FIELD_NUMBER = 18;
        public static final int DEDUPLICATION_ID_FIELD_NUMBER = 3;
        private static final Device DEFAULT_INSTANCE;
        public static final int DISCOVERY_METHOD_FIELD_NUMBER = 40;
        public static final int GROUP_DATA_FIELD_NUMBER = 43;
        public static final int HIFI_FIELD_NUMBER = 20;
        public static final int INCARNATIONS_FIELD_NUMBER = 34;
        public static final int IS_ACTIVE_FIELD_NUMBER = 9;
        public static final int IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER = 46;
        public static final int IS_BEING_ACTIVATED_FIELD_NUMBER = 10;
        public static final int IS_DISABLED_FIELD_NUMBER = 8;
        public static final int IS_GROUP_FIELD_NUMBER = 15;
        public static final int IS_LOCAL_FIELD_NUMBER = 14;
        public static final int IS_NEWLY_DISCOVERED_FIELD_NUMBER = 28;
        public static final int IS_OFFLINE_FIELD_NUMBER = 16;
        public static final int IS_PUBLIC_FIELD_NUMBER = 44;
        public static final int IS_SELF_FIELD_NUMBER = 1;
        public static final int IS_SOCIAL_CONNECT_FIELD_NUMBER = 17;
        public static final int IS_VOICE_ENABLED_FIELD_NUMBER = 27;
        public static final int IS_WEBAPP_FIELD_NUMBER = 12;
        public static final int IS_ZEROCONF_FIELD_NUMBER = 11;
        public static final int LIBRARY_VERSION_FIELD_NUMBER = 37;
        public static final int LICENSE_FIELD_NUMBER = 21;
        public static final int LOCAL_IDENTIFIER_FIELD_NUMBER = 2;
        public static final int LOCAL_IP_FIELD_NUMBER = 39;
        public static final int MODEL_DISPLAY_NAME_FIELD_NUMBER = 31;
        public static final int NAME_FIELD_NUMBER = 5;
        public static final int OUTPUT_PERIPHERAL_FIELD_NUMBER = 38;
        private static volatile r2n0 PARSER = null;
        public static final int STATE_FIELD_NUMBER = 7;
        public static final int SUPPORTED_MEDIA_TYPES_FIELD_NUMBER = 29;
        public static final int SUPPORTS_ALARM_FIELD_NUMBER = 26;
        public static final int SUPPORTS_CROSSFADE_FIELD_NUMBER = 49;
        public static final int SUPPORTS_DJ_FIELD_NUMBER = 36;
        public static final int SUPPORTS_GAPLESS_FIELD_NUMBER = 48;
        public static final int SUPPORTS_LOGOUT_FIELD_NUMBER = 24;
        public static final int SUPPORTS_ON_DEMAND_FIELD_NUMBER = 22;
        public static final int SUPPORTS_PLAYLIST_MIXING_FIELD_NUMBER = 42;
        public static final int SUPPORTS_REMOTE_AUDIO_QUALITY_CONTROL_FIELD_NUMBER = 45;
        public static final int SUPPORTS_REMOTE_SLEEP_TIMER_FIELD_NUMBER = 41;
        public static final int SUPPORTS_RENAME_FIELD_NUMBER = 25;
        public static final int SUPPORTS_VOLUME_FIELD_NUMBER = 23;
        public static final int SUPPORTS_ZEPHYR_FIELD_NUMBER = 47;
        public static final int TYPE_FIELD_NUMBER = 6;
        public static final int VOLUME_FIELD_NUMBER = 19;
        public static final int VOLUME_STEPS_FIELD_NUMBER = 32;
        private int aliasId_;
        private int bitField0_;
        private long creationTimeMs_;
        private int discoveryMethod_;
        private ConnectMessages$GroupData groupData_;
        private Hifi hifi_;
        private boolean isActive_;
        private boolean isAuthenticatedWithCurrentUser_;
        private boolean isBeingActivated_;
        private boolean isDisabled_;
        private boolean isGroup_;
        private boolean isLocal_;
        private boolean isNewlyDiscovered_;
        private boolean isOffline_;
        private boolean isPublic_;
        private boolean isSelf_;
        private boolean isSocialConnect_;
        private boolean isVoiceEnabled_;
        private boolean isWebapp_;
        private boolean isZeroconf_;
        private ConnectMessages$OutputPeripheral outputPeripheral_;
        private boolean supportsAlarm_;
        private boolean supportsCrossfade_;
        private boolean supportsDj_;
        private boolean supportsGapless_;
        private boolean supportsLogout_;
        private boolean supportsOnDemand_;
        private boolean supportsPlaylistMixing_;
        private boolean supportsRemoteAudioQualityControl_;
        private boolean supportsRemoteSleepTimer_;
        private boolean supportsRename_;
        private boolean supportsVolume_;
        private boolean supportsZephyr_;
        private int volumeSteps_;
        private int volume_;
        private String localIdentifier_ = "";
        private String deduplicationId_ = "";
        private String connectStateIdentifier_ = "";
        private String name_ = "";
        private String type_ = "";
        private String state_ = "";
        private String license_ = "";
        private ae50 supportedMediaTypes_ = AbstractC0269h.emptyProtobufList();
        private String brandDisplayName_ = "";
        private String modelDisplayName_ = "";
        private String capabilities_ = "";
        private ae50 incarnations_ = AbstractC0269h.emptyProtobufList();
        private String libraryVersion_ = "";
        private String localIp_ = "";

        public static final class Hifi extends AbstractC0269h implements sre0 {
            private static final Hifi DEFAULT_INSTANCE;
            public static final int DEVICE_SUPPORTED_FIELD_NUMBER = 3;
            public static final int FULLY_SUPPORTED_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER = null;
            public static final int USER_ELIGIBLE_FIELD_NUMBER = 2;
            private boolean deviceSupported_;
            private boolean fullySupported_;
            private boolean userEligible_;

            static {
                Hifi hifi = new Hifi();
                DEFAULT_INSTANCE = hifi;
                AbstractC0269h.registerDefaultInstance(Hifi.class, hifi);
            }

            private Hifi() {
            }

            /* JADX INFO: renamed from: o */
            public static Hifi m7427o() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"fullySupported_", "userEligible_", "deviceSupported_"});
                }
                if (iOrdinal == 3) {
                    return new Hifi();
                }
                if (iOrdinal == 4) {
                    return new C0550c();
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
                synchronized (Hifi.class) {
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

            /* JADX INFO: renamed from: p */
            public final boolean m7428p() {
                return this.deviceSupported_;
            }

            /* JADX INFO: renamed from: q */
            public final boolean m7429q() {
                return this.fullySupported_;
            }

            /* JADX INFO: renamed from: r */
            public final boolean m7430r() {
                return this.userEligible_;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Incarnation extends AbstractC0269h implements sre0 {
            public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 5;
            private static final Incarnation DEFAULT_INSTANCE;
            public static final int IDENTIFIER_FIELD_NUMBER = 2;
            public static final int LOGIN_TYPE_FIELD_NUMBER = 1;
            private static volatile r2n0 PARSER = null;
            public static final int PREFERRED_FIELD_NUMBER = 3;
            public static final int PREFERRED_REASON_FIELD_NUMBER = 4;
            private int loginType_;
            private int preferredReason_;
            private boolean preferred_;
            private String identifier_ = "";
            private String connectStateIdentifier_ = "";

            static {
                Incarnation incarnation = new Incarnation();
                DEFAULT_INSTANCE = incarnation;
                AbstractC0269h.registerDefaultInstance(Incarnation.class, incarnation);
            }

            private Incarnation() {
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
                    return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0007\u0004\f\u0005Ȉ", new Object[]{"loginType_", "identifier_", "preferred_", "preferredReason_", "connectStateIdentifier_"});
                }
                if (iOrdinal == 3) {
                    return new Incarnation();
                }
                if (iOrdinal == 4) {
                    return new C0551d();
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
                synchronized (Incarnation.class) {
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
            public final String m7432o() {
                return this.connectStateIdentifier_;
            }

            /* JADX INFO: renamed from: p */
            public final String m7433p() {
                return this.identifier_;
            }

            /* JADX INFO: renamed from: q */
            public final dti m7434q() {
                dti dtiVarM36854a = dti.m36854a(this.loginType_);
                return dtiVarM36854a == null ? dti.UNRECOGNIZED : dtiVarM36854a;
            }

            /* JADX INFO: renamed from: r */
            public final boolean m7435r() {
                return this.preferred_;
            }

            /* JADX INFO: renamed from: s */
            public final iti m7436s() {
                iti itiVarM51631a = iti.m51631a(this.preferredReason_);
                return itiVarM51631a == null ? iti.UNRECOGNIZED : itiVarM51631a;
            }

            @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
            public final /* bridge */ /* synthetic */ ore0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Device device = new Device();
            DEFAULT_INSTANCE = device;
            AbstractC0269h.registerDefaultInstance(Device.class, device);
        }

        private Device() {
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: A */
        public final boolean m7386A() {
            return this.isGroup_;
        }

        /* JADX INFO: renamed from: B */
        public final boolean m7387B() {
            return this.isNewlyDiscovered_;
        }

        /* JADX INFO: renamed from: C */
        public final boolean m7388C() {
            return this.isSelf_;
        }

        /* JADX INFO: renamed from: D */
        public final boolean m7389D() {
            return this.isSocialConnect_;
        }

        /* JADX INFO: renamed from: E */
        public final boolean m7390E() {
            return this.isVoiceEnabled_;
        }

        /* JADX INFO: renamed from: F */
        public final boolean m7391F() {
            return this.isWebapp_;
        }

        /* JADX INFO: renamed from: G */
        public final boolean m7392G() {
            return this.isZeroconf_;
        }

        /* JADX INFO: renamed from: H */
        public final String m7393H() {
            return this.libraryVersion_;
        }

        /* JADX INFO: renamed from: I */
        public final String m7394I() {
            return this.localIdentifier_;
        }

        /* JADX INFO: renamed from: J */
        public final String m7395J() {
            return this.localIp_;
        }

        /* JADX INFO: renamed from: K */
        public final String m7396K() {
            return this.modelDisplayName_;
        }

        /* JADX INFO: renamed from: L */
        public final ConnectMessages$OutputPeripheral m7397L() {
            ConnectMessages$OutputPeripheral connectMessages$OutputPeripheral = this.outputPeripheral_;
            return connectMessages$OutputPeripheral == null ? ConnectMessages$OutputPeripheral.m7352q() : connectMessages$OutputPeripheral;
        }

        /* JADX INFO: renamed from: M */
        public final String m7398M() {
            return this.state_;
        }

        /* JADX INFO: renamed from: N */
        public final ae50 m7399N() {
            return this.supportedMediaTypes_;
        }

        /* JADX INFO: renamed from: O */
        public final boolean m7400O() {
            return this.supportsDj_;
        }

        /* JADX INFO: renamed from: P */
        public final boolean m7401P() {
            return this.supportsLogout_;
        }

        /* JADX INFO: renamed from: Q */
        public final boolean m7402Q() {
            return this.supportsPlaylistMixing_;
        }

        /* JADX INFO: renamed from: R */
        public final boolean m7403R() {
            return this.supportsRemoteAudioQualityControl_;
        }

        /* JADX INFO: renamed from: S */
        public final boolean m7404S() {
            return this.supportsRemoteSleepTimer_;
        }

        /* JADX INFO: renamed from: T */
        public final boolean m7405T() {
            return this.supportsRename_;
        }

        /* JADX INFO: renamed from: U */
        public final boolean m7406U() {
            return this.supportsVolume_;
        }

        /* JADX INFO: renamed from: V */
        public final boolean m7407V() {
            return this.supportsZephyr_;
        }

        /* JADX INFO: renamed from: W */
        public final String m7408W() {
            return this.type_;
        }

        /* JADX INFO: renamed from: X */
        public final int m7409X() {
            return this.volume_;
        }

        /* JADX INFO: renamed from: Y */
        public final int m7410Y() {
            return this.volumeSteps_;
        }

        /* JADX INFO: renamed from: Z */
        public final boolean m7411Z() {
            return (this.bitField0_ & 64) != 0;
        }

        /* JADX INFO: renamed from: a0 */
        public final boolean m7412a0() {
            return (this.bitField0_ & 128) != 0;
        }

        /* JADX INFO: renamed from: b0 */
        public final boolean m7413b0() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u00000\u0000\u0001\u000110\u0000\u0002\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0003\u0013\u000b\u0014ဉ\u0000\u0015Ȉ\u0016\u0007\u0017\u0007\u0018\u0007\u0019\u0007\u001a\u0007\u001b\u0007\u001c\u0007\u001dȚ\u001eȈ\u001fȈ ဋ\u0001!ለ\u0002\"\u001b#ဋ\u0003$ဇ\u0004%Ȉ&ဉ\u0005'Ȉ(\u000b)\u0007*\u0007+ဉ\u0006,\u0007-\u0007.ဇ\u0007/\u00070\u00071\u0007", new Object[]{"bitField0_", "isSelf_", "localIdentifier_", "deduplicationId_", "connectStateIdentifier_", "name_", "type_", "state_", "isDisabled_", "isActive_", "isBeingActivated_", "isZeroconf_", "isWebapp_", "isLocal_", "isGroup_", "isOffline_", "isSocialConnect_", "creationTimeMs_", "volume_", "hifi_", "license_", "supportsOnDemand_", "supportsVolume_", "supportsLogout_", "supportsRename_", "supportsAlarm_", "isVoiceEnabled_", "isNewlyDiscovered_", "supportedMediaTypes_", "brandDisplayName_", "modelDisplayName_", "volumeSteps_", "capabilities_", "incarnations_", Incarnation.class, "aliasId_", "supportsDj_", "libraryVersion_", "outputPeripheral_", "localIp_", "discoveryMethod_", "supportsRemoteSleepTimer_", "supportsPlaylistMixing_", "groupData_", "isPublic_", "supportsRemoteAudioQualityControl_", "isAuthenticatedWithCurrentUser_", "supportsZephyr_", "supportsGapless_", "supportsCrossfade_"});
            }
            if (iOrdinal == 3) {
                return new Device();
            }
            if (iOrdinal == 4) {
                return new C0549b();
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
            synchronized (Device.class) {
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

        public final boolean getIsLocal() {
            return this.isLocal_;
        }

        public final String getName() {
            return this.name_;
        }

        public final boolean hasCapabilities() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m7414o() {
            return this.brandDisplayName_;
        }

        /* JADX INFO: renamed from: p */
        public final String m7415p() {
            return this.capabilities_;
        }

        /* JADX INFO: renamed from: q */
        public final String m7416q() {
            return this.connectStateIdentifier_;
        }

        /* JADX INFO: renamed from: r */
        public final long m7417r() {
            return this.creationTimeMs_;
        }

        /* JADX INFO: renamed from: s */
        public final int m7418s() {
            return this.discoveryMethod_;
        }

        /* JADX INFO: renamed from: t */
        public final ConnectMessages$GroupData m7419t() {
            ConnectMessages$GroupData connectMessages$GroupData = this.groupData_;
            return connectMessages$GroupData == null ? ConnectMessages$GroupData.m7315p() : connectMessages$GroupData;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        /* JADX INFO: renamed from: u */
        public final Hifi m7420u() {
            Hifi hifi = this.hifi_;
            return hifi == null ? Hifi.m7427o() : hifi;
        }

        /* JADX INFO: renamed from: v */
        public final ae50 m7421v() {
            return this.incarnations_;
        }

        /* JADX INFO: renamed from: w */
        public final boolean m7422w() {
            return this.isActive_;
        }

        /* JADX INFO: renamed from: x */
        public final boolean m7423x() {
            return this.isAuthenticatedWithCurrentUser_;
        }

        /* JADX INFO: renamed from: y */
        public final boolean m7424y() {
            return this.isBeingActivated_;
        }

        /* JADX INFO: renamed from: z */
        public final boolean m7425z() {
            return this.isDisabled_;
        }
    }

    static {
        ConnectMessages$StateResponse connectMessages$StateResponse = new ConnectMessages$StateResponse();
        DEFAULT_INSTANCE = connectMessages$StateResponse;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$StateResponse.class, connectMessages$StateResponse);
    }

    private ConnectMessages$StateResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static ConnectMessages$StateResponse m7379t(byte[] bArr) {
        return (ConnectMessages$StateResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004\u0007\u0005\u001b\u0006\u0007\u0007\u0007\b\u0007", new Object[]{"isRunning_", "isConnected_", "localName_", "shouldUseLocalPlayback_", "devices_", Device.class, "isActive_", "isActiveOnSameDevice_", "isSyncedWithBackend_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$StateResponse();
        }
        if (iOrdinal == 4) {
            return new C0548a();
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
        synchronized (ConnectMessages$StateResponse.class) {
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
    public final ae50 m7380o() {
        return this.devices_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m7381p() {
        return this.isActive_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m7382q() {
        return this.isActiveOnSameDevice_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m7383r() {
        return this.isSyncedWithBackend_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7384s() {
        return this.shouldUseLocalPlayback_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
