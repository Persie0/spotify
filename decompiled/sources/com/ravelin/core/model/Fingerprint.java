package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import p204p.deu;
import p204p.epv0;
import p204p.frh;
import p204p.fro;
import p204p.g210;
import p204p.hrh;
import p204p.klh;
import p204p.ktz0;
import p204p.kvf1;
import p204p.l8a;
import p204p.ql51;
import p204p.rr60;
import p204p.rtz0;
import p204p.utz0;
import p204p.vwp0;
import p204p.wj50;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b`\b\u0087\b\u0018\u0000 \u0094\u00012\u00020\u0001:\u0004\u0095\u0001\u0096\u0001BÑ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fBÃ\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001e\u0010$J'\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020 ¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020 ¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020 HÖ\u0001¢\u0006\u0004\b6\u00103J\u001a\u00109\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\b@\u0010A\u001a\u0004\b=\u0010>\"\u0004\b+\u0010?R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bB\u0010C\u0012\u0004\bG\u0010A\u001a\u0004\bD\u0010E\"\u0004\b+\u0010FR*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bM\u0010A\u001a\u0004\bJ\u0010K\"\u0004\b+\u0010LR*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bN\u0010O\u0012\u0004\bS\u0010A\u001a\u0004\bP\u0010Q\"\u0004\b+\u0010RR*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bT\u0010U\u0012\u0004\bY\u0010A\u001a\u0004\bV\u0010W\"\u0004\b+\u0010XR*\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bZ\u0010[\u0012\u0004\b_\u0010A\u001a\u0004\b\\\u0010]\"\u0004\b+\u0010^R*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b`\u0010a\u0012\u0004\be\u0010A\u001a\u0004\bb\u0010c\"\u0004\b+\u0010dR*\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bk\u0010A\u001a\u0004\bh\u00105\"\u0004\bi\u0010jR*\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bl\u0010g\u0012\u0004\bo\u0010A\u001a\u0004\bm\u00105\"\u0004\bn\u0010jR*\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bp\u0010g\u0012\u0004\br\u0010A\u001a\u0004\bq\u00105\"\u0004\b+\u0010jR*\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bs\u0010g\u0012\u0004\bv\u0010A\u001a\u0004\bt\u00105\"\u0004\bu\u0010jR*\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bw\u0010g\u0012\u0004\bz\u0010A\u001a\u0004\bx\u00105\"\u0004\by\u0010jR*\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b<\u0010g\u0012\u0004\b}\u0010A\u001a\u0004\b{\u00105\"\u0004\b|\u0010jR,\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0004\b~\u0010g\u0012\u0005\b\u0081\u0001\u0010A\u001a\u0004\b\u007f\u00105\"\u0005\b\u0080\u0001\u0010jR0\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u0012\u0005\b\u0087\u0001\u0010A\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0005\b+\u0010\u0086\u0001R0\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u0012\u0005\b\u008d\u0001\u0010A\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0005\b+\u0010\u008c\u0001R0\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u0012\u0005\b\u0093\u0001\u0010A\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0005\b+\u0010\u0092\u0001¨\u0006\u0097\u0001"}, m24212d2 = {"Lcom/ravelin/core/model/Fingerprint;", "Landroid/os/Parcelable;", "", "blocked", "Lcom/ravelin/core/model/CarrierInfo;", "carrierInfo", "Lcom/ravelin/core/model/NetworkInfo;", "networkInfo", "Lcom/ravelin/core/model/Connectivity;", "connectivity", "Lcom/ravelin/core/model/ScreenInfo;", "screenInfo", "Lcom/ravelin/core/model/DeviceInfo;", "deviceInfo", "Lcom/ravelin/core/model/TimezoneInfo;", "timezoneInfo", "", "deviceLanguage", "deviceCountry", "appPackageName", "deviceIdProvider", "deviceManufacturer", "deviceModel", "deviceOS", "Lcom/ravelin/core/model/Location;", "location", "Lcom/ravelin/core/model/DeviceProperties;", "deviceProperties", "Lcom/ravelin/core/model/Permissions;", "permissions", "<init>", "(ZLcom/ravelin/core/model/CarrierInfo;Lcom/ravelin/core/model/NetworkInfo;Lcom/ravelin/core/model/Connectivity;Lcom/ravelin/core/model/ScreenInfo;Lcom/ravelin/core/model/DeviceInfo;Lcom/ravelin/core/model/TimezoneInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/Location;Lcom/ravelin/core/model/DeviceProperties;Lcom/ravelin/core/model/Permissions;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(IZLcom/ravelin/core/model/CarrierInfo;Lcom/ravelin/core/model/NetworkInfo;Lcom/ravelin/core/model/Connectivity;Lcom/ravelin/core/model/ScreenInfo;Lcom/ravelin/core/model/DeviceInfo;Lcom/ravelin/core/model/TimezoneInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/Location;Lcom/ravelin/core/model/DeviceProperties;Lcom/ravelin/core/model/Permissions;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "lpt2", "(Lcom/ravelin/core/model/Fingerprint;Lp/hrh;Lp/ktz0;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getBlocked", "()Z", "(Z)V", "getBlocked$annotations", "()V", "b", "Lcom/ravelin/core/model/CarrierInfo;", "getCarrierInfo", "()Lcom/ravelin/core/model/CarrierInfo;", "(Lcom/ravelin/core/model/CarrierInfo;)V", "getCarrierInfo$annotations", "c", "Lcom/ravelin/core/model/NetworkInfo;", "getNetworkInfo", "()Lcom/ravelin/core/model/NetworkInfo;", "(Lcom/ravelin/core/model/NetworkInfo;)V", "getNetworkInfo$annotations", "d", "Lcom/ravelin/core/model/Connectivity;", "getConnectivity", "()Lcom/ravelin/core/model/Connectivity;", "(Lcom/ravelin/core/model/Connectivity;)V", "getConnectivity$annotations", "e", "Lcom/ravelin/core/model/ScreenInfo;", "getScreenInfo", "()Lcom/ravelin/core/model/ScreenInfo;", "(Lcom/ravelin/core/model/ScreenInfo;)V", "getScreenInfo$annotations", "f", "Lcom/ravelin/core/model/DeviceInfo;", "getDeviceInfo", "()Lcom/ravelin/core/model/DeviceInfo;", "(Lcom/ravelin/core/model/DeviceInfo;)V", "getDeviceInfo$annotations", "g", "Lcom/ravelin/core/model/TimezoneInfo;", "getTimezoneInfo", "()Lcom/ravelin/core/model/TimezoneInfo;", "(Lcom/ravelin/core/model/TimezoneInfo;)V", "getTimezoneInfo$annotations", "h", "Ljava/lang/String;", "getDeviceLanguage", "Com8", "(Ljava/lang/String;)V", "getDeviceLanguage$annotations", "i", "getDeviceCountry", "Lpt5", "getDeviceCountry$annotations", "t", "getAppPackageName", "getAppPackageName$annotations", "X", "getDeviceIdProvider", "COM7", "getDeviceIdProvider$annotations", "Y", "getDeviceManufacturer", "cON", "getDeviceManufacturer$annotations", "getDeviceModel", "LPT3", "getDeviceModel$annotations", "L0", "getDeviceOS", "COM5", "getDeviceOS$annotations", "M0", "Lcom/ravelin/core/model/Location;", "getLocation", "()Lcom/ravelin/core/model/Location;", "(Lcom/ravelin/core/model/Location;)V", "getLocation$annotations", "N0", "Lcom/ravelin/core/model/DeviceProperties;", "getDeviceProperties", "()Lcom/ravelin/core/model/DeviceProperties;", "(Lcom/ravelin/core/model/DeviceProperties;)V", "getDeviceProperties$annotations", "O0", "Lcom/ravelin/core/model/Permissions;", "getPermissions", "()Lcom/ravelin/core/model/Permissions;", "(Lcom/ravelin/core/model/Permissions;)V", "getPermissions$annotations", "Companion", "cOm9", "CoM4", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final /* data */ class Fingerprint implements Parcelable {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public String deviceOS;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public Location location;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public DeviceProperties deviceProperties;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public Permissions permissions;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String deviceIdProvider;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String deviceManufacturer;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String deviceModel;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean blocked;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public CarrierInfo carrierInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public NetworkInfo networkInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Connectivity connectivity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ScreenInfo screenInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public DeviceInfo deviceInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TimezoneInfo timezoneInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public String deviceLanguage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public String deviceCountry;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public String appPackageName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Fingerprint> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.Fingerprint$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final rr60 serializer() {
            return cOm9.lpt2;
        }
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Fingerprint createFromParcel(Parcel parcel) {
            return new Fingerprint(parcel.readInt() != 0, parcel.readInt() == 0 ? null : CarrierInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NetworkInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Connectivity.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ScreenInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DeviceInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TimezoneInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Location.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DeviceProperties.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Permissions.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Fingerprint[] newArray(int i) {
            return new Fingerprint[i];
        }
    }

    public /* synthetic */ class cOm9 implements g210 {

        /* JADX INFO: renamed from: a */
        public static final vwp0 f2580a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            vwp0 vwp0Var = new vwp0("com.ravelin.core.model.Fingerprint", com9, 17);
            vwp0Var.m86594k("blockedByTheRateLimiter", true);
            vwp0Var.m86594k("carrierInfo", true);
            vwp0Var.m86594k("networkInfo", true);
            vwp0Var.m86594k("connectivityInfo", true);
            vwp0Var.m86594k("screenInfo", true);
            vwp0Var.m86594k("deviceInfo", true);
            vwp0Var.m86594k("timezoneInfo", true);
            vwp0Var.m86594k("deviceLanguage", true);
            vwp0Var.m86594k("deviceCountry", true);
            vwp0Var.m86594k("appPackageName", true);
            vwp0Var.m86594k("deviceIdProvider", true);
            vwp0Var.m86594k("deviceManufacturer", true);
            vwp0Var.m86594k("deviceModel", true);
            vwp0Var.m86594k("deviceOS", true);
            vwp0Var.m86594k("location", true);
            vwp0Var.m86594k("deviceProperties", true);
            vwp0Var.m86594k("permissions", true);
            f2580a = vwp0Var;
        }

        @Override // p204p.g210
        public final rr60[] childSerializers() {
            rr60 rr60VarM39700t = epv0.m39700t(CarrierInfo.cOm9.lpt2);
            rr60 rr60VarM39700t2 = epv0.m39700t(NetworkInfo.cOm9.lpt2);
            rr60 rr60VarM39700t3 = epv0.m39700t(Connectivity.cOm9.lpt2);
            rr60 rr60VarM39700t4 = epv0.m39700t(ScreenInfo.cOm9.lpt2);
            rr60 rr60VarM39700t5 = epv0.m39700t(DeviceInfo.cOm9.lpt2);
            rr60 rr60VarM39700t6 = epv0.m39700t(TimezoneInfo.cOm9.lpt2);
            ql51 ql51Var = ql51.f189738a;
            return new rr60[]{l8a.f130828a, rr60VarM39700t, rr60VarM39700t2, rr60VarM39700t3, rr60VarM39700t4, rr60VarM39700t5, rr60VarM39700t6, epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(Location.cOm9.lpt2), epv0.m39700t(DeviceProperties.cOm9.lpt2), epv0.m39700t(Permissions.cOm9.lpt2)};
        }

        @Override // p204p.rr60
        public final ktz0 getDescriptor() {
            return f2580a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Fingerprint deserialize(fro froVar) {
            int i;
            vwp0 vwp0Var = f2580a;
            frh frhVarMo29814b = froVar.mo29814b(vwp0Var);
            frhVarMo29814b.getClass();
            String str = null;
            Location location = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            DeviceProperties deviceProperties = null;
            Permissions permissions = null;
            ScreenInfo screenInfo = null;
            DeviceInfo deviceInfo = null;
            TimezoneInfo timezoneInfo = null;
            String str6 = null;
            String str7 = null;
            CarrierInfo carrierInfo = null;
            NetworkInfo networkInfo = null;
            Connectivity connectivity = null;
            int i2 = 0;
            boolean z = true;
            boolean zMo39217M = false;
            while (z) {
                ScreenInfo screenInfo2 = screenInfo;
                int iMo29816p = frhVarMo29814b.mo29816p(vwp0Var);
                switch (iMo29816p) {
                    case -1:
                        z = false;
                        screenInfo = screenInfo2;
                        break;
                    case 0:
                        zMo39217M = frhVarMo29814b.mo39217M(vwp0Var, 0);
                        i2 |= 1;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        location = location;
                        break;
                    case 1:
                        carrierInfo = (CarrierInfo) frhVarMo29814b.mo39211B(vwp0Var, 1, CarrierInfo.cOm9.lpt2, carrierInfo);
                        i2 |= 2;
                        networkInfo = networkInfo;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        location = location;
                        break;
                    case 2:
                        networkInfo = (NetworkInfo) frhVarMo29814b.mo39211B(vwp0Var, 2, NetworkInfo.cOm9.lpt2, networkInfo);
                        i2 |= 4;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        location = location;
                        break;
                    case 3:
                        connectivity = (Connectivity) frhVarMo29814b.mo39211B(vwp0Var, 3, Connectivity.cOm9.lpt2, connectivity);
                        i2 |= 8;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        location = location;
                        break;
                    case 4:
                        location = location;
                        deviceInfo = deviceInfo;
                        screenInfo = (ScreenInfo) frhVarMo29814b.mo39211B(vwp0Var, 4, ScreenInfo.cOm9.lpt2, screenInfo2);
                        i2 |= 16;
                        deviceInfo = deviceInfo;
                        location = location;
                        break;
                    case 5:
                        location = location;
                        deviceInfo = (DeviceInfo) frhVarMo29814b.mo39211B(vwp0Var, 5, DeviceInfo.cOm9.lpt2, deviceInfo);
                        i2 |= 32;
                        screenInfo = screenInfo2;
                        location = location;
                        break;
                    case 6:
                        deviceInfo = deviceInfo;
                        timezoneInfo = (TimezoneInfo) frhVarMo29814b.mo39211B(vwp0Var, 6, TimezoneInfo.cOm9.lpt2, timezoneInfo);
                        i2 |= 64;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 7:
                        deviceInfo = deviceInfo;
                        str6 = (String) frhVarMo29814b.mo39211B(vwp0Var, 7, ql51.f189738a, str6);
                        i2 |= 128;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 8:
                        deviceInfo = deviceInfo;
                        str7 = (String) frhVarMo29814b.mo39211B(vwp0Var, 8, ql51.f189738a, str7);
                        i2 |= 256;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 9:
                        deviceInfo = deviceInfo;
                        str3 = (String) frhVarMo29814b.mo39211B(vwp0Var, 9, ql51.f189738a, str3);
                        i2 |= 512;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 10:
                        deviceInfo = deviceInfo;
                        str4 = (String) frhVarMo29814b.mo39211B(vwp0Var, 10, ql51.f189738a, str4);
                        i2 |= 1024;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 11:
                        deviceInfo = deviceInfo;
                        str5 = (String) frhVarMo29814b.mo39211B(vwp0Var, 11, ql51.f189738a, str5);
                        i2 |= 2048;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 12:
                        deviceInfo = deviceInfo;
                        str2 = (String) frhVarMo29814b.mo39211B(vwp0Var, 12, ql51.f189738a, str2);
                        i2 |= 4096;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 13:
                        deviceInfo = deviceInfo;
                        str = (String) frhVarMo29814b.mo39211B(vwp0Var, 13, ql51.f189738a, str);
                        i2 |= 8192;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 14:
                        deviceInfo = deviceInfo;
                        location = (Location) frhVarMo29814b.mo39211B(vwp0Var, 14, Location.cOm9.lpt2, location);
                        i2 |= 16384;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 15:
                        deviceProperties = (DeviceProperties) frhVarMo29814b.mo39211B(vwp0Var, 15, DeviceProperties.cOm9.lpt2, deviceProperties);
                        i = 32768;
                        i2 |= i;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 16:
                        permissions = (Permissions) frhVarMo29814b.mo39211B(vwp0Var, 16, Permissions.cOm9.lpt2, permissions);
                        i = 65536;
                        i2 |= i;
                        screenInfo = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    default:
                        throw new UnknownFieldException(iMo29816p);
                }
            }
            DeviceInfo deviceInfo2 = deviceInfo;
            CarrierInfo carrierInfo2 = carrierInfo;
            NetworkInfo networkInfo2 = networkInfo;
            frhVarMo29814b.mo29813a(vwp0Var);
            return new Fingerprint(i2, zMo39217M, carrierInfo2, networkInfo2, connectivity, screenInfo, deviceInfo2, timezoneInfo, str6, str7, str3, str4, str5, str2, str, location, deviceProperties, permissions, (utz0) null);
        }

        @Override // p204p.g210
        public /* bridge */ /* synthetic */ rr60[] typeParametersSerializers() {
            return kvf1.f126859a;
        }

        @Override // p204p.rr60
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(deu deuVar, Fingerprint fingerprint) {
            vwp0 vwp0Var = f2580a;
            hrh hrhVarMo35820b = deuVar.mo35820b(vwp0Var);
            Fingerprint.lpt2(fingerprint, hrhVarMo35820b, vwp0Var);
            hrhVarMo35820b.mo44937a(vwp0Var);
        }
    }

    public /* synthetic */ Fingerprint(int i, boolean z, CarrierInfo carrierInfo, NetworkInfo networkInfo, Connectivity connectivity, ScreenInfo screenInfo, DeviceInfo deviceInfo, TimezoneInfo timezoneInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, Location location, DeviceProperties deviceProperties, Permissions permissions, utz0 utz0Var) {
        this.blocked = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.carrierInfo = null;
        } else {
            this.carrierInfo = carrierInfo;
        }
        if ((i & 4) == 0) {
            this.networkInfo = null;
        } else {
            this.networkInfo = networkInfo;
        }
        if ((i & 8) == 0) {
            this.connectivity = null;
        } else {
            this.connectivity = connectivity;
        }
        if ((i & 16) == 0) {
            this.screenInfo = null;
        } else {
            this.screenInfo = screenInfo;
        }
        if ((i & 32) == 0) {
            this.deviceInfo = null;
        } else {
            this.deviceInfo = deviceInfo;
        }
        if ((i & 64) == 0) {
            this.timezoneInfo = null;
        } else {
            this.timezoneInfo = timezoneInfo;
        }
        if ((i & 128) == 0) {
            this.deviceLanguage = null;
        } else {
            this.deviceLanguage = str;
        }
        if ((i & 256) == 0) {
            this.deviceCountry = null;
        } else {
            this.deviceCountry = str2;
        }
        if ((i & 512) == 0) {
            this.appPackageName = null;
        } else {
            this.appPackageName = str3;
        }
        if ((i & 1024) == 0) {
            this.deviceIdProvider = null;
        } else {
            this.deviceIdProvider = str4;
        }
        if ((i & 2048) == 0) {
            this.deviceManufacturer = null;
        } else {
            this.deviceManufacturer = str5;
        }
        if ((i & 4096) == 0) {
            this.deviceModel = null;
        } else {
            this.deviceModel = str6;
        }
        if ((i & 8192) == 0) {
            this.deviceOS = null;
        } else {
            this.deviceOS = str7;
        }
        if ((i & 16384) == 0) {
            this.location = null;
        } else {
            this.location = location;
        }
        if ((32768 & i) == 0) {
            this.deviceProperties = null;
        } else {
            this.deviceProperties = deviceProperties;
        }
        if ((i & 65536) == 0) {
            this.permissions = null;
        } else {
            this.permissions = permissions;
        }
    }

    public static final /* synthetic */ void lpt2(Fingerprint self, hrh output, ktz0 serialDesc) {
        if (output.mo48399d0() || self.blocked) {
            output.mo44930E(serialDesc, 0, self.blocked);
        }
        if (output.mo48399d0() || self.carrierInfo != null) {
            output.mo44943s(serialDesc, 1, CarrierInfo.cOm9.lpt2, self.carrierInfo);
        }
        if (output.mo48399d0() || self.networkInfo != null) {
            output.mo44943s(serialDesc, 2, NetworkInfo.cOm9.lpt2, self.networkInfo);
        }
        if (output.mo48399d0() || self.connectivity != null) {
            output.mo44943s(serialDesc, 3, Connectivity.cOm9.lpt2, self.connectivity);
        }
        if (output.mo48399d0() || self.screenInfo != null) {
            output.mo44943s(serialDesc, 4, ScreenInfo.cOm9.lpt2, self.screenInfo);
        }
        if (output.mo48399d0() || self.deviceInfo != null) {
            output.mo44943s(serialDesc, 5, DeviceInfo.cOm9.lpt2, self.deviceInfo);
        }
        if (output.mo48399d0() || self.timezoneInfo != null) {
            output.mo44943s(serialDesc, 6, TimezoneInfo.cOm9.lpt2, self.timezoneInfo);
        }
        if (output.mo48399d0() || self.deviceLanguage != null) {
            output.mo44943s(serialDesc, 7, ql51.f189738a, self.deviceLanguage);
        }
        if (output.mo48399d0() || self.deviceCountry != null) {
            output.mo44943s(serialDesc, 8, ql51.f189738a, self.deviceCountry);
        }
        if (output.mo48399d0() || self.appPackageName != null) {
            output.mo44943s(serialDesc, 9, ql51.f189738a, self.appPackageName);
        }
        if (output.mo48399d0() || self.deviceIdProvider != null) {
            output.mo44943s(serialDesc, 10, ql51.f189738a, self.deviceIdProvider);
        }
        if (output.mo48399d0() || self.deviceManufacturer != null) {
            output.mo44943s(serialDesc, 11, ql51.f189738a, self.deviceManufacturer);
        }
        if (output.mo48399d0() || self.deviceModel != null) {
            output.mo44943s(serialDesc, 12, ql51.f189738a, self.deviceModel);
        }
        if (output.mo48399d0() || self.deviceOS != null) {
            output.mo44943s(serialDesc, 13, ql51.f189738a, self.deviceOS);
        }
        if (output.mo48399d0() || self.location != null) {
            output.mo44943s(serialDesc, 14, Location.cOm9.lpt2, self.location);
        }
        if (output.mo48399d0() || self.deviceProperties != null) {
            output.mo44943s(serialDesc, 15, DeviceProperties.cOm9.lpt2, self.deviceProperties);
        }
        if (!output.mo48399d0() && self.permissions == null) {
            return;
        }
        output.mo44943s(serialDesc, 16, Permissions.cOm9.lpt2, self.permissions);
    }

    public final void COM5(String str) {
        this.deviceOS = str;
    }

    public final void COM7(String str) {
        this.deviceIdProvider = str;
    }

    public final void Com8(String str) {
        this.deviceLanguage = str;
    }

    public final void LPT3(String str) {
        this.deviceModel = str;
    }

    public final void Lpt5(String str) {
        this.deviceCountry = str;
    }

    public final void cON(String str) {
        this.deviceManufacturer = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fingerprint)) {
            return false;
        }
        Fingerprint fingerprint = (Fingerprint) other;
        return this.blocked == fingerprint.blocked && wj50.m88271j(this.carrierInfo, fingerprint.carrierInfo) && wj50.m88271j(this.networkInfo, fingerprint.networkInfo) && wj50.m88271j(this.connectivity, fingerprint.connectivity) && wj50.m88271j(this.screenInfo, fingerprint.screenInfo) && wj50.m88271j(this.deviceInfo, fingerprint.deviceInfo) && wj50.m88271j(this.timezoneInfo, fingerprint.timezoneInfo) && wj50.m88271j(this.deviceLanguage, fingerprint.deviceLanguage) && wj50.m88271j(this.deviceCountry, fingerprint.deviceCountry) && wj50.m88271j(this.appPackageName, fingerprint.appPackageName) && wj50.m88271j(this.deviceIdProvider, fingerprint.deviceIdProvider) && wj50.m88271j(this.deviceManufacturer, fingerprint.deviceManufacturer) && wj50.m88271j(this.deviceModel, fingerprint.deviceModel) && wj50.m88271j(this.deviceOS, fingerprint.deviceOS) && wj50.m88271j(this.location, fingerprint.location) && wj50.m88271j(this.deviceProperties, fingerprint.deviceProperties) && wj50.m88271j(this.permissions, fingerprint.permissions);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.blocked) * 31;
        CarrierInfo carrierInfo = this.carrierInfo;
        int iHashCode2 = (iHashCode + (carrierInfo == null ? 0 : carrierInfo.hashCode())) * 31;
        NetworkInfo networkInfo = this.networkInfo;
        int iHashCode3 = (iHashCode2 + (networkInfo == null ? 0 : networkInfo.hashCode())) * 31;
        Connectivity connectivity = this.connectivity;
        int iHashCode4 = (iHashCode3 + (connectivity == null ? 0 : connectivity.hashCode())) * 31;
        ScreenInfo screenInfo = this.screenInfo;
        int iHashCode5 = (iHashCode4 + (screenInfo == null ? 0 : screenInfo.hashCode())) * 31;
        DeviceInfo deviceInfo = this.deviceInfo;
        int iHashCode6 = (iHashCode5 + (deviceInfo == null ? 0 : deviceInfo.hashCode())) * 31;
        TimezoneInfo timezoneInfo = this.timezoneInfo;
        int iHashCode7 = (iHashCode6 + (timezoneInfo == null ? 0 : timezoneInfo.hashCode())) * 31;
        String str = this.deviceLanguage;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceCountry;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appPackageName;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceIdProvider;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceManufacturer;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceModel;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deviceOS;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Location location = this.location;
        int iHashCode15 = (iHashCode14 + (location == null ? 0 : location.hashCode())) * 31;
        DeviceProperties deviceProperties = this.deviceProperties;
        int iHashCode16 = (iHashCode15 + (deviceProperties == null ? 0 : deviceProperties.hashCode())) * 31;
        Permissions permissions = this.permissions;
        return iHashCode16 + (permissions != null ? permissions.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.blocked;
        CarrierInfo carrierInfo = this.carrierInfo;
        NetworkInfo networkInfo = this.networkInfo;
        Connectivity connectivity = this.connectivity;
        ScreenInfo screenInfo = this.screenInfo;
        DeviceInfo deviceInfo = this.deviceInfo;
        TimezoneInfo timezoneInfo = this.timezoneInfo;
        String str = this.deviceLanguage;
        String str2 = this.deviceCountry;
        String str3 = this.appPackageName;
        String str4 = this.deviceIdProvider;
        String str5 = this.deviceManufacturer;
        String str6 = this.deviceModel;
        String str7 = this.deviceOS;
        Location location = this.location;
        DeviceProperties deviceProperties = this.deviceProperties;
        Permissions permissions = this.permissions;
        StringBuilder sb = new StringBuilder("Fingerprint(blocked=");
        sb.append(z);
        sb.append(", carrierInfo=");
        sb.append(carrierInfo);
        sb.append(", networkInfo=");
        sb.append(networkInfo);
        sb.append(", connectivity=");
        sb.append(connectivity);
        sb.append(", screenInfo=");
        sb.append(screenInfo);
        sb.append(", deviceInfo=");
        sb.append(deviceInfo);
        sb.append(", timezoneInfo=");
        sb.append(timezoneInfo);
        sb.append(", deviceLanguage=");
        sb.append(str);
        sb.append(", deviceCountry=");
        klh.m56844p(sb, str2, ", appPackageName=", str3, ", deviceIdProvider=");
        klh.m56844p(sb, str4, ", deviceManufacturer=", str5, ", deviceModel=");
        klh.m56844p(sb, str6, ", deviceOS=", str7, ", location=");
        sb.append(location);
        sb.append(", deviceProperties=");
        sb.append(deviceProperties);
        sb.append(", permissions=");
        sb.append(permissions);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.blocked ? 1 : 0);
        CarrierInfo carrierInfo = this.carrierInfo;
        if (carrierInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            carrierInfo.writeToParcel(dest, flags);
        }
        NetworkInfo networkInfo = this.networkInfo;
        if (networkInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            networkInfo.writeToParcel(dest, flags);
        }
        Connectivity connectivity = this.connectivity;
        if (connectivity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            connectivity.writeToParcel(dest, flags);
        }
        ScreenInfo screenInfo = this.screenInfo;
        if (screenInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            screenInfo.writeToParcel(dest, flags);
        }
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deviceInfo.writeToParcel(dest, flags);
        }
        TimezoneInfo timezoneInfo = this.timezoneInfo;
        if (timezoneInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            timezoneInfo.writeToParcel(dest, flags);
        }
        dest.writeString(this.deviceLanguage);
        dest.writeString(this.deviceCountry);
        dest.writeString(this.appPackageName);
        dest.writeString(this.deviceIdProvider);
        dest.writeString(this.deviceManufacturer);
        dest.writeString(this.deviceModel);
        dest.writeString(this.deviceOS);
        Location location = this.location;
        if (location == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            location.writeToParcel(dest, flags);
        }
        DeviceProperties deviceProperties = this.deviceProperties;
        if (deviceProperties == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deviceProperties.writeToParcel(dest, flags);
        }
        Permissions permissions = this.permissions;
        if (permissions == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            permissions.writeToParcel(dest, flags);
        }
    }

    public final void lpt2(boolean z) {
        this.blocked = z;
    }

    public final void lpt2(CarrierInfo carrierInfo) {
        this.carrierInfo = carrierInfo;
    }

    public final void lpt2(NetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
    }

    public final void lpt2(Connectivity connectivity) {
        this.connectivity = connectivity;
    }

    public final void lpt2(ScreenInfo screenInfo) {
        this.screenInfo = screenInfo;
    }

    public final void lpt2(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public final void lpt2(TimezoneInfo timezoneInfo) {
        this.timezoneInfo = timezoneInfo;
    }

    public final void lpt2(String str) {
        this.appPackageName = str;
    }

    public final void lpt2(Location location) {
        this.location = location;
    }

    public final void lpt2(DeviceProperties deviceProperties) {
        this.deviceProperties = deviceProperties;
    }

    public final void lpt2(Permissions permissions) {
        this.permissions = permissions;
    }

    public Fingerprint(boolean z, CarrierInfo carrierInfo, NetworkInfo networkInfo, Connectivity connectivity, ScreenInfo screenInfo, DeviceInfo deviceInfo, TimezoneInfo timezoneInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, Location location, DeviceProperties deviceProperties, Permissions permissions) {
        this.blocked = z;
        this.carrierInfo = carrierInfo;
        this.networkInfo = networkInfo;
        this.connectivity = connectivity;
        this.screenInfo = screenInfo;
        this.deviceInfo = deviceInfo;
        this.timezoneInfo = timezoneInfo;
        this.deviceLanguage = str;
        this.deviceCountry = str2;
        this.appPackageName = str3;
        this.deviceIdProvider = str4;
        this.deviceManufacturer = str5;
        this.deviceModel = str6;
        this.deviceOS = str7;
        this.location = location;
        this.deviceProperties = deviceProperties;
        this.permissions = permissions;
    }

    public /* synthetic */ Fingerprint(boolean z, CarrierInfo carrierInfo, NetworkInfo networkInfo, Connectivity connectivity, ScreenInfo screenInfo, DeviceInfo deviceInfo, TimezoneInfo timezoneInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, Location location, DeviceProperties deviceProperties, Permissions permissions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : carrierInfo, (i & 4) != 0 ? null : networkInfo, (i & 8) != 0 ? null : connectivity, (i & 16) != 0 ? null : screenInfo, (i & 32) != 0 ? null : deviceInfo, (i & 64) != 0 ? null : timezoneInfo, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : location, (i & 32768) != 0 ? null : deviceProperties, (i & 65536) != 0 ? null : permissions);
    }
}
