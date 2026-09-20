package com.spotify.bluetooth.categorizer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.hrh;
import p204p.ktz0;
import p204p.kyx;
import p204p.ql51;
import p204p.rr60;
import p204p.rtz0;
import p204p.s571;
import p204p.utz0;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002DEBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJV\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010\u0012J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J'\u00100\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u00101\u0012\u0004\b5\u00106\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u00104R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u00101\u0012\u0004\b9\u00106\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u00104R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00101\u0012\u0004\b<\u00106\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u00104R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00101\u0012\u0004\b?\u00106\u001a\u0004\b=\u0010\u001a\"\u0004\b>\u00104R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010@\u0012\u0004\bA\u00106\u001a\u0004\b\b\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\bC\u00106\u001a\u0004\bB\u0010\u001a¨\u0006F"}, m24212d2 = {"Lcom/spotify/bluetooth/categorizer/CategorizerResponse;", "Landroid/os/Parcelable;", "", kyx.f127932c, "company", "model", "version", "", "isInterapp", "diplayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lp/utz0;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/spotify/bluetooth/categorizer/CategorizerResponse;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "write$Self$src_main_java_com_spotify_bluetooth_categorizer_categorizer", "(Lcom/spotify/bluetooth/categorizer/CategorizerResponse;Lp/hrh;Lp/ktz0;)V", "write$Self", "Ljava/lang/String;", "getCategory", "setCategory", "(Ljava/lang/String;)V", "getCategory$annotations", "()V", "getCompany", "setCompany", "getCompany$annotations", "getModel", "setModel", "getModel$annotations", "getVersion", "setVersion", "getVersion$annotations", "Z", "isInterapp$annotations", "getDiplayName", "getDiplayName$annotations", "Companion", "$serializer", "src_main_java_com_spotify_bluetooth_categorizer-categorizer"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class CategorizerResponse implements Parcelable {
    private String category;
    private String company;
    private final String diplayName;
    private final boolean isInterapp;
    private String model;
    private String version;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CategorizerResponse> CREATOR = new Creator();

    @Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/bluetooth/categorizer/CategorizerResponse$Companion;", "", "<init>", "()V", "", kyx.f127932c, "company", "", "interapp", "Lcom/spotify/bluetooth/categorizer/CategorizerResponse;", "createForTest", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/spotify/bluetooth/categorizer/CategorizerResponse;", "create", "()Lcom/spotify/bluetooth/categorizer/CategorizerResponse;", "Lp/rr60;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_bluetooth_categorizer-categorizer"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CategorizerResponse create() {
            return new CategorizerResponse((String) null, (String) null, (String) null, (String) null, false, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public final CategorizerResponse createForTest(String category, String company, boolean interapp) {
            return new CategorizerResponse(category, company, (String) null, (String) null, interapp, (String) null, 44, (DefaultConstructorMarker) null);
        }

        public final rr60 serializer() {
            return CategorizerResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Creator implements Parcelable.Creator<CategorizerResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategorizerResponse createFromParcel(Parcel parcel) {
            return new CategorizerResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategorizerResponse[] newArray(int i) {
            return new CategorizerResponse[i];
        }
    }

    public CategorizerResponse() {
        this((String) null, (String) null, (String) null, (String) null, false, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CategorizerResponse copy$default(CategorizerResponse categorizerResponse, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categorizerResponse.category;
        }
        if ((i & 2) != 0) {
            str2 = categorizerResponse.company;
        }
        if ((i & 4) != 0) {
            str3 = categorizerResponse.model;
        }
        if ((i & 8) != 0) {
            str4 = categorizerResponse.version;
        }
        if ((i & 16) != 0) {
            z = categorizerResponse.isInterapp;
        }
        if ((i & 32) != 0) {
            str5 = categorizerResponse.diplayName;
        }
        boolean z2 = z;
        String str6 = str5;
        return categorizerResponse.copy(str, str2, str3, str4, z2, str6);
    }

    public static final CategorizerResponse create() {
        return INSTANCE.create();
    }

    public static final CategorizerResponse createForTest(String str, String str2, boolean z) {
        return INSTANCE.createForTest(str, str2, z);
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getCompany$annotations() {
    }

    public static /* synthetic */ void getDiplayName$annotations() {
    }

    public static /* synthetic */ void getModel$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInterapp$annotations() {
    }

    /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_bluetooth_categorizer_categorizer */
    public static final /* synthetic */ void m4028x6ab57d1a(CategorizerResponse self, hrh output, ktz0 serialDesc) {
        String str = self.category;
        if (str != null) {
            output.mo44943s(serialDesc, 0, ql51.f189738a, str);
        }
        String str2 = self.company;
        if (str2 != null) {
            output.mo44943s(serialDesc, 1, ql51.f189738a, str2);
        }
        String str3 = self.model;
        if (str3 != null) {
            output.mo44943s(serialDesc, 2, ql51.f189738a, str3);
        }
        String str4 = self.version;
        if (str4 != null) {
            output.mo44943s(serialDesc, 3, ql51.f189738a, str4);
        }
        if (output.mo48399d0() || self.isInterapp) {
            output.mo44930E(serialDesc, 4, self.isInterapp);
        }
        String str5 = self.diplayName;
        if (str5 != null) {
            output.mo44943s(serialDesc, 5, ql51.f189738a, str5);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCompany() {
        return this.company;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsInterapp() {
        return this.isInterapp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDiplayName() {
        return this.diplayName;
    }

    public final CategorizerResponse copy(String category, String company, String model, String version, boolean isInterapp, String diplayName) {
        return new CategorizerResponse(category, company, model, version, isInterapp, diplayName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategorizerResponse)) {
            return false;
        }
        CategorizerResponse categorizerResponse = (CategorizerResponse) other;
        return wj50.m88271j(this.category, categorizerResponse.category) && wj50.m88271j(this.company, categorizerResponse.company) && wj50.m88271j(this.model, categorizerResponse.model) && wj50.m88271j(this.version, categorizerResponse.version) && this.isInterapp == categorizerResponse.isInterapp && wj50.m88271j(this.diplayName, categorizerResponse.diplayName);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCompany() {
        return this.company;
    }

    public final String getDiplayName() {
        return this.diplayName;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.category;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.company;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.model;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.version;
        int iM77245d = s571.m77245d((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.isInterapp);
        String str5 = this.diplayName;
        return iM77245d + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isInterapp() {
        return this.isInterapp;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setCompany(String str) {
        this.company = str;
    }

    public final void setModel(String str) {
        this.model = str;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.category);
        dest.writeString(this.company);
        dest.writeString(this.model);
        dest.writeString(this.version);
        dest.writeInt(this.isInterapp ? 1 : 0);
        dest.writeString(this.diplayName);
    }

    public /* synthetic */ CategorizerResponse(int i, String str, String str2, String str3, String str4, boolean z, String str5, utz0 utz0Var) {
        if ((i & 1) == 0) {
            this.category = null;
        } else {
            this.category = str;
        }
        if ((i & 2) == 0) {
            this.company = null;
        } else {
            this.company = str2;
        }
        if ((i & 4) == 0) {
            this.model = null;
        } else {
            this.model = str3;
        }
        if ((i & 8) == 0) {
            this.version = null;
        } else {
            this.version = str4;
        }
        if ((i & 16) == 0) {
            this.isInterapp = false;
        } else {
            this.isInterapp = z;
        }
        if ((i & 32) == 0) {
            this.diplayName = null;
        } else {
            this.diplayName = str5;
        }
    }

    public CategorizerResponse(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.category = str;
        this.company = str2;
        this.model = str3;
        this.version = str4;
        this.isInterapp = z;
        this.diplayName = str5;
    }

    public /* synthetic */ CategorizerResponse(String str, String str2, String str3, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str5);
    }
}
