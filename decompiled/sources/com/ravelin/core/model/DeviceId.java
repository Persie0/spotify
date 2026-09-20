package com.ravelin.core.model;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.MediaDrm;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import p204p.bk5;
import p204p.deu;
import p204p.edo;
import p204p.epv0;
import p204p.f2f1;
import p204p.frh;
import p204p.fro;
import p204p.g210;
import p204p.gk71;
import p204p.hrh;
import p204p.ktz0;
import p204p.kvf1;
import p204p.lzj;
import p204p.nap;
import p204p.p4b1;
import p204p.pzb0;
import p204p.q0f1;
import p204p.ql51;
import p204p.rr60;
import p204p.rtz0;
import p204p.s571;
import p204p.u2b0;
import p204p.utu0;
import p204p.utz0;
import p204p.vuc;
import p204p.vue;
import p204p.vwp0;
import p204p.w2a1;
import p204p.wj50;
import p204p.wl51;
import p204p.wue;
import p204p.y1f1;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\b\u0001\u0018\u0000 M2\u00020\u0001:\u0002NOB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Bu\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0004\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0000H\u0086\u0002¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u001fJ\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010-\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010)R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00100\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010)R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u00103\u001a\u0004\b9\u0010:R\"\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u00100\u0012\u0004\b>\u00103\u001a\u0004\b=\u0010)R\"\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u00100\u0012\u0004\bA\u00103\u001a\u0004\b@\u0010)R\"\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u00100\u0012\u0004\bD\u00103\u001a\u0004\bC\u0010)R\"\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u00100\u0012\u0004\bG\u00103\u001a\u0004\bF\u0010)R\"\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u00100\u0012\u0004\bI\u00103\u001a\u0004\b!\u0010)R\"\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u00100\u0012\u0004\bL\u00103\u001a\u0004\bK\u0010)¨\u0006P"}, m24212d2 = {"Lcom/ravelin/core/model/DeviceId;", "Landroid/os/Parcelable;", "Lp/y1f1;", "deviceIds", "<init>", "(Lp/y1f1;)V", "", "seen0", "", "id", "deviceIdProvider", "", "createdAt", "imei", "imsi", "bluetoothMAC", "wiFiMAC", "androidId", "mediaDrmId", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "lpt2", "(Lcom/ravelin/core/model/DeviceId;Lp/hrh;Lp/ktz0;)V", "describeContents", "()I", "other", "Lpt5", "(Lcom/ravelin/core/model/DeviceId;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "LPT3", "getId$annotations", "()V", "b", "cON", "getDeviceIdProvider$annotations", "c", "Ljava/lang/Long;", "Com8", "()Ljava/lang/Long;", "getCreatedAt$annotations", "d", "COM5", "getImei$annotations", "e", "COM6", "getImsi$annotations", "f", "COM7", "getBluetoothMAC$annotations", "g", "cOM4", "getWiFiMAC$annotations", "h", "getAndroidId$annotations", "i", "prN", "getMediaDrmId$annotations", "Companion", "CoM4", "cOm9", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
@SuppressLint({"HardwareIds", "MissingPermission"})
public final class DeviceId implements Parcelable {

    /* JADX INFO: renamed from: t */
    public static volatile DeviceId f2503t;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String deviceIdProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Long createdAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String imei;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String imsi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String bluetoothMAC;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String wiFiMAC;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String androidId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String mediaDrmId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DeviceId> CREATOR = new CoM6();

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final DeviceId createFromParcel(Parcel parcel) {
            return new DeviceId(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final DeviceId[] newArray(int i) {
            return new DeviceId[i];
        }
    }

    public /* synthetic */ class cOm9 implements g210 {

        /* JADX INFO: renamed from: a */
        public static final vwp0 f2513a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            vwp0 vwp0Var = new vwp0("com.ravelin.core.model.DeviceId", com9, 9);
            vwp0Var.m86594k("id", false);
            vwp0Var.m86594k("deviceIdProvider", true);
            vwp0Var.m86594k("createdAt", true);
            vwp0Var.m86594k("imei", false);
            vwp0Var.m86594k("imsi", false);
            vwp0Var.m86594k("bluetoothMAC", false);
            vwp0Var.m86594k("wiFiMAC", false);
            vwp0Var.m86594k("androidId", false);
            vwp0Var.m86594k("mediaDrmId", false);
            f2513a = vwp0Var;
        }

        @Override // p204p.g210
        public final rr60[] childSerializers() {
            ql51 ql51Var = ql51.f189738a;
            return new rr60[]{ql51Var, epv0.m39700t(ql51Var), epv0.m39700t(u2b0.f226058a), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
        }

        @Override // p204p.rr60
        public final ktz0 getDescriptor() {
            return f2513a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final DeviceId deserialize(fro froVar) {
            vwp0 vwp0Var = f2513a;
            frh frhVarMo29814b = froVar.mo29814b(vwp0Var);
            frhVarMo29814b.getClass();
            String strMo39226f = null;
            String str = null;
            Long l = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            int i = 0;
            boolean z = true;
            while (z) {
                int iMo29816p = frhVarMo29814b.mo29816p(vwp0Var);
                switch (iMo29816p) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strMo39226f = frhVarMo29814b.mo39226f(vwp0Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        str = (String) frhVarMo29814b.mo39211B(vwp0Var, 1, ql51.f189738a, str);
                        i |= 2;
                        break;
                    case 2:
                        l = (Long) frhVarMo29814b.mo39211B(vwp0Var, 2, u2b0.f226058a, l);
                        i |= 4;
                        break;
                    case 3:
                        str2 = (String) frhVarMo29814b.mo39211B(vwp0Var, 3, ql51.f189738a, str2);
                        i |= 8;
                        break;
                    case 4:
                        str3 = (String) frhVarMo29814b.mo39211B(vwp0Var, 4, ql51.f189738a, str3);
                        i |= 16;
                        break;
                    case 5:
                        str4 = (String) frhVarMo29814b.mo39211B(vwp0Var, 5, ql51.f189738a, str4);
                        i |= 32;
                        break;
                    case 6:
                        str5 = (String) frhVarMo29814b.mo39211B(vwp0Var, 6, ql51.f189738a, str5);
                        i |= 64;
                        break;
                    case 7:
                        str6 = (String) frhVarMo29814b.mo39211B(vwp0Var, 7, ql51.f189738a, str6);
                        i |= 128;
                        break;
                    case 8:
                        str7 = (String) frhVarMo29814b.mo39211B(vwp0Var, 8, ql51.f189738a, str7);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iMo29816p);
                }
            }
            frhVarMo29814b.mo29813a(vwp0Var);
            return new DeviceId(i, strMo39226f, str, l, str2, str3, str4, str5, str6, str7, null);
        }

        @Override // p204p.g210
        public /* bridge */ /* synthetic */ rr60[] typeParametersSerializers() {
            return kvf1.f126859a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(deu deuVar, DeviceId deviceId) {
            vwp0 vwp0Var = f2513a;
            hrh hrhVarMo35820b = deuVar.mo35820b(vwp0Var);
            DeviceId.lpt2(deviceId, hrhVarMo35820b, vwp0Var);
            hrhVarMo35820b.mo44937a(vwp0Var);
        }
    }

    public /* synthetic */ DeviceId(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l, str3, str4, str5, str6, str7, str8);
    }

    /* JADX INFO: renamed from: COM5, reason: from getter */
    public final String getImei() {
        return this.imei;
    }

    /* JADX INFO: renamed from: COM6, reason: from getter */
    public final String getImsi() {
        return this.imsi;
    }

    /* JADX INFO: renamed from: COM7, reason: from getter */
    public final String getBluetoothMAC() {
        return this.bluetoothMAC;
    }

    /* JADX INFO: renamed from: Com8, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: LPT3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: Lpt5, reason: from getter */
    public final String getAndroidId() {
        return this.androidId;
    }

    /* JADX INFO: renamed from: c */
    public final int m2223c() {
        String[] strArr = {this.imei, this.imsi, this.bluetoothMAC, this.wiFiMAC, this.androidId, this.mediaDrmId, this.deviceIdProvider, String.valueOf(this.createdAt)};
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            String str = strArr[i2];
            i += (str == null || wl51.m88460J0(str) || str.equals("02:00:00:00:00:00")) ? 0 : 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: cOM4, reason: from getter */
    public final String getWiFiMAC() {
        return this.wiFiMAC;
    }

    /* JADX INFO: renamed from: cON, reason: from getter */
    public final String getDeviceIdProvider() {
        return this.deviceIdProvider;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DeviceId.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DeviceId deviceId = (DeviceId) other;
        return wj50.m88271j(this.id, deviceId.id) && wj50.m88271j(this.imei, deviceId.imei) && wj50.m88271j(this.imsi, deviceId.imsi) && wj50.m88271j(this.bluetoothMAC, deviceId.bluetoothMAC) && wj50.m88271j(this.wiFiMAC, deviceId.wiFiMAC) && wj50.m88271j(this.androidId, deviceId.androidId) && wj50.m88271j(this.mediaDrmId, deviceId.mediaDrmId);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.imei;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.imsi;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bluetoothMAC;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.wiFiMAC;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.androidId;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.mediaDrmId;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.deviceIdProvider;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Long l = this.createdAt;
        return iHashCode8 + (l != null ? l.hashCode() : 0);
    }

    /* JADX INFO: renamed from: prN, reason: from getter */
    public final String getMediaDrmId() {
        return this.mediaDrmId;
    }

    public String toString() {
        return q0f1.m71831e(new p4b1(13)).m41881b(INSTANCE.serializer(), this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.deviceIdProvider);
        Long l = this.createdAt;
        if (l == null) {
            dest.writeInt(0);
        } else {
            nap.m64026s(dest, 1, l);
        }
        dest.writeString(this.imei);
        dest.writeString(this.imsi);
        dest.writeString(this.bluetoothMAC);
        dest.writeString(this.wiFiMAC);
        dest.writeString(this.androidId);
        dest.writeString(this.mediaDrmId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceId(y1f1 y1f1Var) {
        String str = y1f1Var.f268261b;
        this(str == null ? "" : str, y1f1Var.f268268i, y1f1Var.f268269j, y1f1Var.f268262c, y1f1Var.f268263d, y1f1Var.f268264e, y1f1Var.f268265f, y1f1Var.f268266g, y1f1Var.f268267h);
    }

    public final int Lpt5(DeviceId other) {
        if (other == null) {
            return 1;
        }
        return m2223c() - other.m2223c();
    }

    public static final /* synthetic */ void lpt2(DeviceId self, hrh output, ktz0 serialDesc) {
        String str = self.id;
        Long l = self.createdAt;
        Object obj = self.deviceIdProvider;
        output.mo44931G(serialDesc, 0, str);
        if (output.mo48399d0() || obj != null) {
            output.mo44943s(serialDesc, 1, ql51.f189738a, obj);
        }
        if (output.mo48399d0() || l == null || l.longValue() != 0) {
            output.mo44943s(serialDesc, 2, u2b0.f226058a, l);
        }
        rr60 rr60Var = ql51.f189738a;
        output.mo44943s(serialDesc, 3, rr60Var, self.imei);
        output.mo44943s(serialDesc, 4, rr60Var, self.imsi);
        output.mo44943s(serialDesc, 5, rr60Var, self.bluetoothMAC);
        output.mo44943s(serialDesc, 6, rr60Var, self.wiFiMAC);
        output.mo44943s(serialDesc, 7, rr60Var, self.androidId);
        output.mo44943s(serialDesc, 8, rr60Var, self.mediaDrmId);
    }

    public /* synthetic */ DeviceId(int i, String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, utz0 utz0Var) {
        if (505 != (i & 505)) {
            edo.m38617p(i, 505, cOm9.lpt2.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.deviceIdProvider = null;
        } else {
            this.deviceIdProvider = str2;
        }
        if ((i & 4) == 0) {
            this.createdAt = 0L;
        } else {
            this.createdAt = l;
        }
        this.imei = str3;
        this.imsi = str4;
        this.bluetoothMAC = str5;
        this.wiFiMAC = str6;
        this.androidId = str7;
        this.mediaDrmId = str8;
    }

    public DeviceId(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.id = str;
        this.deviceIdProvider = str2;
        this.createdAt = l;
        this.imei = str3;
        this.imsi = str4;
        this.bluetoothMAC = str5;
        this.wiFiMAC = str6;
        this.androidId = str7;
        this.mediaDrmId = str8;
    }

    /* JADX INFO: renamed from: com.ravelin.core.model.DeviceId$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX INFO: renamed from: a */
        public static String m2224a() {
            MediaDrm mediaDrm;
            String strM29591N0 = null;
            try {
                mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
                try {
                    strM29591N0 = bk5.m29591N0(mediaDrm.getPropertyByteArray("deviceUniqueId"), new p4b1(15), 30);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                mediaDrm = null;
            }
            if (mediaDrm != null) {
                mediaDrm.release();
            }
            return strM29591N0;
        }

        /* JADX INFO: renamed from: b */
        public static String m2225b() {
            return bk5.m29591N0(Build.MODEL.getBytes(vuc.f244913a), new p4b1(15), 30);
        }

        public final boolean COM7() {
            try {
                new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L)).release();
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public final DeviceId Lpt5() {
            DeviceId deviceId = DeviceId.f2503t;
            if (deviceId != null) {
                return deviceId;
            }
            throw new UninitializedPropertyAccessException("Instance has not been previously initialized with application");
        }

        /* JADX WARN: Code duplicated, block: B:131:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:158:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:163:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:208:0x0283  */
        /* JADX WARN: Code duplicated, block: B:209:0x0285  */
        /* JADX WARN: Code duplicated, block: B:215:0x0295 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:216:0x0297  */
        /* JADX WARN: Code duplicated, block: B:220:0x02a5  */
        /* JADX WARN: Code duplicated, block: B:222:0x02ab A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:223:0x02ad  */
        /* JADX WARN: Code duplicated, block: B:224:0x02b8  */
        /* JADX WARN: Code duplicated, block: B:226:0x02c4  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:72:0x00f4  */
        public final DeviceId lpt2(String str, String str2, Long l, String str3, wue wueVar, vue vueVar, Context context) throws NoSuchAlgorithmException {
            Boolean boolValueOf;
            String meid;
            String macAddress;
            String packageName;
            Long l2;
            Long lValueOf;
            byte[] bArrM40585a;
            BluetoothAdapter defaultAdapter;
            String strM71721s = str;
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (vueVar != null) {
                try {
                    boolValueOf = Boolean.valueOf(lzj.m60353c(context, "android.permission.READ_PHONE_STATE") == 0);
                } catch (SecurityException e) {
                    utu0 utu0Var = gk71.f80747a;
                    utu0Var.m83940H("DeviceId");
                    utu0Var.m83951t(e, new Object[0]);
                }
            } else {
                boolValueOf = null;
            }
            String subscriberId = (!wj50.m88271j(boolValueOf, Boolean.TRUE) || Build.VERSION.SDK_INT > 28) ? null : ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
            Boolean boolValueOf2 = vueVar != null ? Boolean.valueOf(lzj.m60353c(context, "android.permission.READ_PHONE_STATE") == 0) : null;
            Boolean bool = Boolean.TRUE;
            if (wj50.m88271j(boolValueOf2, bool)) {
                Object systemService = context.getApplicationContext().getSystemService("phone");
                TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
                int i = Build.VERSION.SDK_INT;
                if (i < 26) {
                    Integer numValueOf = telephonyManager != null ? Integer.valueOf(telephonyManager.getDataNetworkType()) : null;
                    if (numValueOf != null && numValueOf.intValue() == 16) {
                        meid = telephonyManager.getDeviceId();
                    } else {
                        meid = null;
                    }
                } else if (26 > i || i >= 29 || telephonyManager == null) {
                    meid = null;
                } else {
                    meid = telephonyManager.getImei();
                }
            } else {
                meid = null;
            }
            if (meid == null) {
                if (wj50.m88271j(vueVar != null ? Boolean.valueOf(lzj.m60353c(context, "android.permission.READ_PHONE_STATE") == 0) : null, bool)) {
                    Object systemService2 = context.getApplicationContext().getSystemService("phone");
                    TelephonyManager telephonyManager2 = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 26) {
                        Integer numValueOf2 = telephonyManager2 != null ? Integer.valueOf(telephonyManager2.getDataNetworkType()) : null;
                        if (numValueOf2 != null && numValueOf2.intValue() == 4) {
                            meid = telephonyManager2.getDeviceId();
                        } else {
                            meid = null;
                        }
                    } else if (26 > i2 || i2 >= 29 || telephonyManager2 == null) {
                        meid = null;
                    } else {
                        meid = telephonyManager2.getMeid();
                    }
                } else {
                    meid = null;
                }
            }
            String address = (!wj50.m88271j(vueVar != null ? Boolean.valueOf(lzj.m60353c(context, "android.permission.BLUETOOTH") == 0) : null, bool) || Build.VERSION.SDK_INT >= 29 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) ? null : defaultAdapter.getAddress();
            if (Build.VERSION.SDK_INT >= 29) {
                macAddress = null;
            } else {
                if (wj50.m88271j(vueVar != null ? Boolean.valueOf(lzj.m60353c(context, "android.permission.ACCESS_WIFI_STATE") == 0) : null, bool)) {
                    if (wj50.m88271j(vueVar != null ? Boolean.valueOf(lzj.m60353c(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) : null, bool)) {
                        if (wj50.m88271j(vueVar != null ? Boolean.valueOf(lzj.m60353c(context, "android.permission.ACCESS_FINE_LOCATION") == 0) : null, bool)) {
                            if (wj50.m88271j(vueVar != null ? Boolean.valueOf(lzj.m60353c(context, "android.permission.ACCESS_NETWORK_STATE") == 0) : null, bool)) {
                                macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
                            } else {
                                macAddress = null;
                            }
                        } else {
                            macAddress = null;
                        }
                    } else {
                        macAddress = null;
                    }
                } else {
                    macAddress = null;
                }
            }
            String strM2224a = m2224a();
            String strM77250i = strM2224a != null ? s571.m77250i(strM2224a, m2225b()) : null;
            if (str3 != null && !wl51.m88460J0(str3) && !wl51.m88460J0(str3)) {
                boolean z = true;
                for (int i3 = 0; i3 < str3.length(); i3++) {
                    char cCharAt = str3.charAt(i3);
                    z = z && '!' <= cCharAt && cCharAt < 127;
                }
                if (z && str3.length() <= 128) {
                    packageName = "external provider";
                } else if (str2 != null) {
                    packageName = context.getPackageName();
                } else {
                    packageName = context.getPackageName();
                }
            } else if (str2 != null || wl51.m88460J0(str2)) {
                packageName = context.getPackageName();
            } else {
                packageName = str2;
            }
            if (str3 == null || wl51.m88460J0(str3) || wj50.m88271j(str2, "external provider")) {
                if (!wj50.m88271j(str2, "external provider")) {
                    if ((l != null ? l.longValue() : 0L) == 0) {
                        lValueOf = Long.valueOf(System.currentTimeMillis());
                    } else {
                        l2 = l;
                    }
                    if (str3 == null && !wl51.m88460J0(str3) && !wl51.m88460J0(str3)) {
                        boolean z2 = true;
                        for (int i4 = 0; i4 < str3.length(); i4++) {
                            char cCharAt2 = str3.charAt(i4);
                            z2 = z2 && '!' <= cCharAt2 && cCharAt2 < 127;
                        }
                        if (z2 && str3.length() <= 128) {
                            strM71721s = "extand-".concat(str3);
                        } else if (strM71721s != null) {
                            if (strM77250i == null) {
                                if (string.length() == 0) {
                                    if (wueVar != null) {
                                        bArrM40585a = ((f2f1) wueVar).m40585a(32);
                                    } else {
                                        bArrM40585a = null;
                                    }
                                    strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
                                } else {
                                    strM71721s = pzb0.m71721s("4", string);
                                }
                            } else if (string.length() == 0) {
                                if (wueVar != null) {
                                    bArrM40585a = ((f2f1) wueVar).m40585a(32);
                                } else {
                                    bArrM40585a = null;
                                }
                                strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
                            } else {
                                strM71721s = pzb0.m71721s("4", string);
                            }
                        } else if (strM77250i == null) {
                            if (string.length() == 0) {
                                if (wueVar != null) {
                                    bArrM40585a = ((f2f1) wueVar).m40585a(32);
                                } else {
                                    bArrM40585a = null;
                                }
                                strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
                            } else {
                                strM71721s = pzb0.m71721s("4", string);
                            }
                        } else if (string.length() == 0) {
                            if (wueVar != null) {
                                bArrM40585a = ((f2f1) wueVar).m40585a(32);
                            } else {
                                bArrM40585a = null;
                            }
                            strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
                        } else {
                            strM71721s = pzb0.m71721s("4", string);
                        }
                    } else if (strM71721s != null || wl51.m88460J0(strM71721s) || strM71721s.equals("rvnand-3-C248C629AF1FE0A8C46B95668064C1D2952A9E91D207BC0CC3C5D584C2F7553A")) {
                        if (strM77250i == null && !wl51.m88460J0(strM77250i)) {
                            strM71721s = pzb0.m71721s("6", strM77250i);
                        } else if (string.length() == 0) {
                            if (wueVar != null) {
                                bArrM40585a = ((f2f1) wueVar).m40585a(32);
                            } else {
                                bArrM40585a = null;
                            }
                            strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
                        } else {
                            strM71721s = pzb0.m71721s("4", string);
                        }
                    }
                    return new DeviceId(strM71721s, packageName, l2, meid, subscriberId, address, macAddress, string, strM77250i, null);
                }
                lValueOf = Long.valueOf(l != null ? l.longValue() : System.currentTimeMillis());
            } else {
                lValueOf = Long.valueOf(System.currentTimeMillis());
            }
            l2 = lValueOf;
            if (str3 == null) {
                if (strM71721s != null) {
                    if (strM77250i == null) {
                        if (string.length() == 0) {
                            if (wueVar != null) {
                                bArrM40585a = ((f2f1) wueVar).m40585a(32);
                            } else {
                                bArrM40585a = null;
                            }
                            strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
                        } else {
                            strM71721s = pzb0.m71721s("4", string);
                        }
                    } else if (string.length() == 0) {
                        if (wueVar != null) {
                            bArrM40585a = ((f2f1) wueVar).m40585a(32);
                        } else {
                            bArrM40585a = null;
                        }
                        strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
                    } else {
                        strM71721s = pzb0.m71721s("4", string);
                    }
                } else if (strM77250i == null) {
                    if (string.length() == 0) {
                        if (wueVar != null) {
                            bArrM40585a = ((f2f1) wueVar).m40585a(32);
                        } else {
                            bArrM40585a = null;
                        }
                        strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
                    } else {
                        strM71721s = pzb0.m71721s("4", string);
                    }
                } else if (string.length() == 0) {
                    if (wueVar != null) {
                        bArrM40585a = ((f2f1) wueVar).m40585a(32);
                    } else {
                        bArrM40585a = null;
                    }
                    strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
                } else {
                    strM71721s = pzb0.m71721s("4", string);
                }
            } else if (strM71721s != null) {
                if (strM77250i == null) {
                    if (string.length() == 0) {
                        if (wueVar != null) {
                            bArrM40585a = ((f2f1) wueVar).m40585a(32);
                        } else {
                            bArrM40585a = null;
                        }
                        strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
                    } else {
                        strM71721s = pzb0.m71721s("4", string);
                    }
                } else if (string.length() == 0) {
                    if (wueVar != null) {
                        bArrM40585a = ((f2f1) wueVar).m40585a(32);
                    } else {
                        bArrM40585a = null;
                    }
                    strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
                } else {
                    strM71721s = pzb0.m71721s("4", string);
                }
            } else if (strM77250i == null) {
                if (string.length() == 0) {
                    if (wueVar != null) {
                        bArrM40585a = ((f2f1) wueVar).m40585a(32);
                    } else {
                        bArrM40585a = null;
                    }
                    strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
                } else {
                    strM71721s = pzb0.m71721s("4", string);
                }
            } else if (string.length() == 0) {
                if (wueVar != null) {
                    bArrM40585a = ((f2f1) wueVar).m40585a(32);
                } else {
                    bArrM40585a = null;
                }
                strM71721s = pzb0.m71721s("5", String.valueOf(bArrM40585a));
            } else {
                strM71721s = pzb0.m71721s("4", string);
            }
            return new DeviceId(strM71721s, packageName, l2, meid, subscriberId, address, macAddress, string, strM77250i, null);
        }

        public final rr60 serializer() {
            return cOm9.lpt2;
        }

        public final void lpt2(DeviceId deviceId) {
            synchronized (this) {
                if (!wj50.m88271j(DeviceId.f2503t, deviceId)) {
                    DeviceId.f2503t = deviceId;
                }
            }
        }

        public final DeviceId lpt2(Context context, wue wueVar, vue vueVar, y1f1 y1f1Var, String str) throws NoSuchAlgorithmException {
            DeviceId deviceId = new DeviceId(y1f1Var);
            DeviceId deviceIdLpt2 = lpt2(deviceId.getId(), deviceId.getDeviceIdProvider(), deviceId.getCreatedAt(), str, wueVar, vueVar, context);
            return (deviceId.Lpt5(deviceIdLpt2) <= 0 || !(str == null || wl51.m88460J0(str))) ? deviceIdLpt2 : deviceId;
        }

        public final Object lpt2(Context context) throws NoSuchAlgorithmException {
            String strM71721s;
            try {
                return Lpt5().getId();
            } catch (UninitializedPropertyAccessException unused) {
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                String strM2224a = m2224a();
                String strM77250i = strM2224a != null ? s571.m77250i(strM2224a, m2225b()) : null;
                if (strM2224a == null) {
                    strM71721s = pzb0.m71721s("4", Settings.Secure.getString(context.getContentResolver(), "android_id"));
                } else {
                    strM71721s = pzb0.m71721s("6", strM2224a + m2225b());
                }
                lpt2(new DeviceId(strM71721s, null, 0L, null, null, null, null, string, strM77250i, null));
                return w2a1.f247311a;
            }
        }
    }
}
