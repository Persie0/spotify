package com.spotify.libs.connect.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectDeviceDiscoverySnapshot extends AbstractC0269h implements sre0 {
    public static final int ACTIVE_AUDIO_OUTPUT_BRAND_FIELD_NUMBER = 37;
    public static final int ACTIVE_AUDIO_OUTPUT_DEVICE_TYPE_FIELD_NUMBER = 36;
    public static final int ACTIVE_AUDIO_OUTPUT_MODEL_FIELD_NUMBER = 38;
    public static final int ACTIVE_AUDIO_OUTPUT_NAME_FIELD_NUMBER = 34;
    public static final int ACTIVE_AUDIO_OUTPUT_TYPE_FIELD_NUMBER = 35;
    public static final int BLE_DEVICE_DISCOVERY_SNAPSHOT_ID_FIELD_NUMBER = 40;
    public static final int BLUETOOTH_CATEGORY_FIELD_NUMBER = 28;
    public static final int BLUETOOTH_ID_FIELD_NUMBER = 26;
    public static final int BLUETOOTH_TYPE_FIELD_NUMBER = 27;
    public static final int BRAND_FIELD_NUMBER = 8;
    public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 3;
    private static final ConnectDeviceDiscoverySnapshot DEFAULT_INSTANCE;
    public static final int DEVICE_STATE_FIELD_NUMBER = 10;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 9;
    public static final int DISCOVERY_TYPE_FIELD_NUMBER = 23;
    public static final int ENTITY_TYPE_FIELD_NUMBER = 2;
    public static final int GROUP_DEVICES_FIELD_NUMBER = 42;
    public static final int INCARNATIONS_FIELD_NUMBER = 25;
    public static final int IS_ACTIVE_FIELD_NUMBER = 12;
    public static final int IS_AVAILABLE_ON_LOCAL_NETWORK_FIELD_NUMBER = 17;
    public static final int IS_CONNECTING_FIELD_NUMBER = 13;
    public static final int IS_DISABLED_FIELD_NUMBER = 15;
    public static final int IS_GROUP_FIELD_NUMBER = 14;
    public static final int IS_SELF_FIELD_NUMBER = 11;
    public static final int IS_ZEROCONF_FIELD_NUMBER = 16;
    public static final int JAM_SESSION_IDENTIFIER_FIELD_NUMBER = 5;
    public static final int LOCAL_IDENTIFIER_FIELD_NUMBER = 4;
    public static final int LOCAL_TIME_FIELD_NUMBER = 30;
    public static final int MODEL_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PREFERRED_PROTOCOL_FIELD_NUMBER = 32;
    public static final int PREFERRED_PROTOCOL_REASON_FIELD_NUMBER = 33;
    public static final int REASON_FIELD_NUMBER = 29;
    public static final int RSSI_FIELD_NUMBER = 39;
    public static final int SNAPSHOT_ID_FIELD_NUMBER = 1;
    public static final int SUPPORTS_DJ_FIELD_NUMBER = 21;
    public static final int SUPPORTS_HIFI_FIELD_NUMBER = 22;
    public static final int SUPPORTS_LOGOUT_FIELD_NUMBER = 20;
    public static final int SUPPORTS_REMOTE_SLEEP_TIMER_FIELD_NUMBER = 24;
    public static final int SUPPORTS_RENAME_FIELD_NUMBER = 41;
    public static final int SUPPORTS_VOLUME_FIELD_NUMBER = 19;
    public static final int TIMEZONE_FIELD_NUMBER = 31;
    public static final int VOLUME_STEPS_FIELD_NUMBER = 18;
    private int bitField0_;
    private int bitField1_;
    private int discoveryType_;
    private boolean isActive_;
    private boolean isAvailableOnLocalNetwork_;
    private boolean isConnecting_;
    private boolean isDisabled_;
    private boolean isGroup_;
    private boolean isSelf_;
    private boolean isZeroconf_;
    private int rssi_;
    private boolean supportsDj_;
    private boolean supportsHifi_;
    private boolean supportsLogout_;
    private boolean supportsRemoteSleepTimer_;
    private boolean supportsRename_;
    private boolean supportsVolume_;
    private int volumeSteps_;
    private String snapshotId_ = "";
    private String entityType_ = "";
    private String connectStateIdentifier_ = "";
    private String localIdentifier_ = "";
    private String jamSessionIdentifier_ = "";
    private String name_ = "";
    private String model_ = "";
    private String brand_ = "";
    private String deviceType_ = "";
    private String deviceState_ = "";
    private ae50 incarnations_ = AbstractC0269h.emptyProtobufList();
    private String bluetoothId_ = "";
    private String bluetoothType_ = "";
    private String bluetoothCategory_ = "";
    private String reason_ = "";
    private String localTime_ = "";
    private String timezone_ = "";
    private String preferredProtocol_ = "";
    private String preferredProtocolReason_ = "";
    private String activeAudioOutputName_ = "";
    private String activeAudioOutputType_ = "";
    private String activeAudioOutputDeviceType_ = "";
    private String activeAudioOutputBrand_ = "";
    private String activeAudioOutputModel_ = "";
    private String bleDeviceDiscoverySnapshotId_ = "";
    private ae50 groupDevices_ = AbstractC0269h.emptyProtobufList();

    public static final class GroupDevices extends AbstractC0269h implements sre0 {
        public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 4;
        private static final GroupDevices DEFAULT_INSTANCE;
        public static final int DEVICE_TYPE_FIELD_NUMBER = 1;
        public static final int GROUPING_STATUS_FIELD_NUMBER = 2;
        public static final int MODEL_DISPLAY_NAME_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private String deviceType_ = "";
        private String groupingStatus_ = "";
        private String name_ = "";
        private String connectStateIdentifier_ = "";
        private String modelDisplayName_ = "";

        static {
            GroupDevices groupDevices = new GroupDevices();
            DEFAULT_INSTANCE = groupDevices;
            AbstractC0269h.registerDefaultInstance(GroupDevices.class, groupDevices);
        }

        private GroupDevices() {
        }

        /* JADX INFO: renamed from: n */
        public static void m12731n(GroupDevices groupDevices, String str) {
            groupDevices.getClass();
            str.getClass();
            groupDevices.bitField0_ |= 8;
            groupDevices.connectStateIdentifier_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static void m12732o(GroupDevices groupDevices, String str) {
            groupDevices.getClass();
            groupDevices.bitField0_ |= 1;
            groupDevices.deviceType_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static void m12733p(GroupDevices groupDevices, String str) {
            groupDevices.getClass();
            groupDevices.bitField0_ |= 2;
            groupDevices.groupingStatus_ = str;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static void m12734q(GroupDevices groupDevices, String str) {
            groupDevices.getClass();
            str.getClass();
            groupDevices.bitField0_ |= 16;
            groupDevices.modelDisplayName_ = str;
        }

        /* JADX INFO: renamed from: r */
        public static void m12735r(GroupDevices groupDevices, String str) {
            groupDevices.getClass();
            str.getClass();
            groupDevices.bitField0_ |= 4;
            groupDevices.name_ = str;
        }

        /* JADX INFO: renamed from: t */
        public static C0830b m12737t() {
            return (C0830b) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "deviceType_", "groupingStatus_", "name_", "connectStateIdentifier_", "modelDisplayName_"});
            }
            if (iOrdinal == 3) {
                return new GroupDevices();
            }
            if (iOrdinal == 4) {
                return new C0830b();
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
            synchronized (GroupDevices.class) {
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

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot = new ConnectDeviceDiscoverySnapshot();
        DEFAULT_INSTANCE = connectDeviceDiscoverySnapshot;
        AbstractC0269h.registerDefaultInstance(ConnectDeviceDiscoverySnapshot.class, connectDeviceDiscoverySnapshot);
    }

    private ConnectDeviceDiscoverySnapshot() {
    }

    /* JADX INFO: renamed from: A */
    public static void m12686A(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        str.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 512;
        connectDeviceDiscoverySnapshot.deviceState_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m12687B(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 256;
        connectDeviceDiscoverySnapshot.deviceType_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m12688C(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, int i) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 4194304;
        connectDeviceDiscoverySnapshot.discoveryType_ = i;
    }

    /* JADX INFO: renamed from: D */
    public static void m12689D(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 2;
        connectDeviceDiscoverySnapshot.entityType_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m12690E(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 2048;
        connectDeviceDiscoverySnapshot.isActive_ = z;
    }

    /* JADX INFO: renamed from: F */
    public static void m12691F(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 65536;
        connectDeviceDiscoverySnapshot.isAvailableOnLocalNetwork_ = z;
    }

    /* JADX INFO: renamed from: G */
    public static void m12692G(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 4096;
        connectDeviceDiscoverySnapshot.isConnecting_ = z;
    }

    /* JADX INFO: renamed from: H */
    public static void m12693H(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 16384;
        connectDeviceDiscoverySnapshot.isDisabled_ = z;
    }

    /* JADX INFO: renamed from: I */
    public static void m12694I(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 8192;
        connectDeviceDiscoverySnapshot.isGroup_ = z;
    }

    /* JADX INFO: renamed from: J */
    public static void m12695J(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 1024;
        connectDeviceDiscoverySnapshot.isSelf_ = z;
    }

    /* JADX INFO: renamed from: K */
    public static void m12696K(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 32768;
        connectDeviceDiscoverySnapshot.isZeroconf_ = z;
    }

    /* JADX INFO: renamed from: L */
    public static void m12697L(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        str.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 16;
        connectDeviceDiscoverySnapshot.jamSessionIdentifier_ = str;
    }

    /* JADX INFO: renamed from: M */
    public static void m12698M(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        str.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 8;
        connectDeviceDiscoverySnapshot.localIdentifier_ = str;
    }

    /* JADX INFO: renamed from: N */
    public static void m12699N(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        str.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 268435456;
        connectDeviceDiscoverySnapshot.localTime_ = str;
    }

    /* JADX INFO: renamed from: O */
    public static void m12700O(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        str.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 64;
        connectDeviceDiscoverySnapshot.model_ = str;
    }

    /* JADX INFO: renamed from: P */
    public static void m12701P(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        str.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 32;
        connectDeviceDiscoverySnapshot.name_ = str;
    }

    /* JADX INFO: renamed from: Q */
    public static void m12702Q(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 1073741824;
        connectDeviceDiscoverySnapshot.preferredProtocol_ = str;
    }

    /* JADX INFO: renamed from: R */
    public static void m12703R(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        str.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= Integer.MIN_VALUE;
        connectDeviceDiscoverySnapshot.preferredProtocolReason_ = str;
    }

    /* JADX INFO: renamed from: S */
    public static void m12704S(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        str.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 134217728;
        connectDeviceDiscoverySnapshot.reason_ = str;
    }

    /* JADX INFO: renamed from: T */
    public static void m12705T(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, int i) {
        connectDeviceDiscoverySnapshot.bitField1_ |= 32;
        connectDeviceDiscoverySnapshot.rssi_ = i;
    }

    /* JADX INFO: renamed from: U */
    public static void m12706U(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 1;
        connectDeviceDiscoverySnapshot.snapshotId_ = str;
    }

    /* JADX INFO: renamed from: V */
    public static void m12707V(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 1048576;
        connectDeviceDiscoverySnapshot.supportsDj_ = z;
    }

    /* JADX INFO: renamed from: W */
    public static void m12708W(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 2097152;
        connectDeviceDiscoverySnapshot.supportsHifi_ = z;
    }

    /* JADX INFO: renamed from: X */
    public static void m12709X(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 524288;
        connectDeviceDiscoverySnapshot.supportsLogout_ = z;
    }

    /* JADX INFO: renamed from: Y */
    public static void m12710Y(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 8388608;
        connectDeviceDiscoverySnapshot.supportsRemoteSleepTimer_ = z;
    }

    /* JADX INFO: renamed from: Z */
    public static void m12711Z(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField1_ |= 128;
        connectDeviceDiscoverySnapshot.supportsRename_ = z;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m12712a0(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, boolean z) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 262144;
        connectDeviceDiscoverySnapshot.supportsVolume_ = z;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m12713b0(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 536870912;
        connectDeviceDiscoverySnapshot.timezone_ = str;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m12714c0(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, int i) {
        connectDeviceDiscoverySnapshot.bitField0_ |= 131072;
        connectDeviceDiscoverySnapshot.volumeSteps_ = i;
    }

    /* JADX INFO: renamed from: f0 */
    public static C0829a m12715f0() {
        return (C0829a) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m12716n(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, ArrayList arrayList) {
        ae50 ae50Var = connectDeviceDiscoverySnapshot.groupDevices_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            connectDeviceDiscoverySnapshot.groupDevices_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, connectDeviceDiscoverySnapshot.groupDevices_);
    }

    /* JADX INFO: renamed from: o */
    public static void m12717o(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, ArrayList arrayList) {
        ae50 ae50Var = connectDeviceDiscoverySnapshot.incarnations_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            connectDeviceDiscoverySnapshot.incarnations_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, connectDeviceDiscoverySnapshot.incarnations_);
    }

    /* JADX INFO: renamed from: p */
    public static void m12718p(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        connectDeviceDiscoverySnapshot.bitField1_ |= 8;
        connectDeviceDiscoverySnapshot.activeAudioOutputBrand_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12719q(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        connectDeviceDiscoverySnapshot.bitField1_ |= 4;
        connectDeviceDiscoverySnapshot.activeAudioOutputDeviceType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12720r(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        connectDeviceDiscoverySnapshot.bitField1_ |= 16;
        connectDeviceDiscoverySnapshot.activeAudioOutputModel_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m12721s(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        connectDeviceDiscoverySnapshot.bitField1_ |= 1;
        connectDeviceDiscoverySnapshot.activeAudioOutputName_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m12722t(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        connectDeviceDiscoverySnapshot.bitField1_ |= 2;
        connectDeviceDiscoverySnapshot.activeAudioOutputType_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m12723u(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        connectDeviceDiscoverySnapshot.bitField1_ |= 64;
        connectDeviceDiscoverySnapshot.bleDeviceDiscoverySnapshotId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m12724v(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        str.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 67108864;
        connectDeviceDiscoverySnapshot.bluetoothCategory_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m12725w(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 16777216;
        connectDeviceDiscoverySnapshot.bluetoothId_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m12726x(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        str.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 33554432;
        connectDeviceDiscoverySnapshot.bluetoothType_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m12727y(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        str.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 128;
        connectDeviceDiscoverySnapshot.brand_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m12728z(ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot, String str) {
        connectDeviceDiscoverySnapshot.getClass();
        str.getClass();
        connectDeviceDiscoverySnapshot.bitField0_ |= 4;
        connectDeviceDiscoverySnapshot.connectStateIdentifier_ = str;
    }

    /* JADX INFO: renamed from: d0 */
    public final String m12729d0() {
        return this.connectStateIdentifier_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001*\u0000\u0002\u0001**\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဇ\u000e\u0010ဇ\u000f\u0011ဇ\u0010\u0012င\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015\u0017င\u0016\u0018ဇ\u0017\u0019\u001a\u001aဈ\u0018\u001bဈ\u0019\u001cဈ\u001a\u001dဈ\u001b\u001eဈ\u001c\u001fဈ\u001d ဈ\u001e!ဈ\u001f\"ဈ #ဈ!$ဈ\"%ဈ#&ဈ$'င%(ဈ&)ဇ'*\u001b", new Object[]{"bitField0_", "bitField1_", "snapshotId_", "entityType_", "connectStateIdentifier_", "localIdentifier_", "jamSessionIdentifier_", "name_", "model_", "brand_", "deviceType_", "deviceState_", "isSelf_", "isActive_", "isConnecting_", "isGroup_", "isDisabled_", "isZeroconf_", "isAvailableOnLocalNetwork_", "volumeSteps_", "supportsVolume_", "supportsLogout_", "supportsDj_", "supportsHifi_", "discoveryType_", "supportsRemoteSleepTimer_", "incarnations_", "bluetoothId_", "bluetoothType_", "bluetoothCategory_", "reason_", "localTime_", "timezone_", "preferredProtocol_", "preferredProtocolReason_", "activeAudioOutputName_", "activeAudioOutputType_", "activeAudioOutputDeviceType_", "activeAudioOutputBrand_", "activeAudioOutputModel_", "rssi_", "bleDeviceDiscoverySnapshotId_", "supportsRename_", "groupDevices_", GroupDevices.class});
        }
        if (iOrdinal == 3) {
            return new ConnectDeviceDiscoverySnapshot();
        }
        if (iOrdinal == 4) {
            return new C0829a(DEFAULT_INSTANCE);
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
        synchronized (ConnectDeviceDiscoverySnapshot.class) {
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

    /* JADX INFO: renamed from: e0 */
    public final String m12730e0() {
        return this.localIdentifier_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
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
