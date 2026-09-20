package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance;
import com.spotify.playbacknative.AudioDriver;

/* JADX INFO: loaded from: classes8.dex */
public final class b421 implements Parcelable {
    public static final Parcelable.Creator<b421> CREATOR = new q321(7);

    /* JADX INFO: renamed from: O0 */
    public static final b421 f23182O0 = new b421(false, false, false, false, false, false, 0, false, null, null, null, false, false, null, AudioDriver.SPOTIFY_MAX_VOLUME);

    /* JADX INFO: renamed from: L0 */
    public final boolean f23183L0;

    /* JADX INFO: renamed from: M0 */
    public final boolean f23184M0;

    /* JADX INFO: renamed from: N0 */
    public final String f23185N0;

    /* JADX INFO: renamed from: X */
    public final TermsConditionAcceptance f23186X;

    /* JADX INFO: renamed from: Y */
    public final PrivacyPolicyAcceptance f23187Y;

    /* JADX INFO: renamed from: Z */
    public final MarketingMessagesOption f23188Z;

    /* JADX INFO: renamed from: a */
    public final boolean f23189a;

    /* JADX INFO: renamed from: b */
    public final boolean f23190b;

    /* JADX INFO: renamed from: c */
    public final boolean f23191c;

    /* JADX INFO: renamed from: d */
    public final boolean f23192d;

    /* JADX INFO: renamed from: e */
    public final boolean f23193e;

    /* JADX INFO: renamed from: f */
    public final boolean f23194f;

    /* JADX INFO: renamed from: g */
    public final boolean f23195g;

    /* JADX INFO: renamed from: h */
    public final boolean f23196h;

    /* JADX INFO: renamed from: i */
    public final int f23197i;

    /* JADX INFO: renamed from: t */
    public final boolean f23198t;

    public b421(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, boolean z9, TermsConditionAcceptance termsConditionAcceptance, PrivacyPolicyAcceptance privacyPolicyAcceptance, MarketingMessagesOption marketingMessagesOption, boolean z10, boolean z11, String str) {
        this.f23189a = z;
        this.f23190b = z2;
        this.f23191c = z3;
        this.f23192d = z4;
        this.f23193e = z5;
        this.f23194f = z6;
        this.f23195g = z7;
        this.f23196h = z8;
        this.f23197i = i;
        this.f23198t = z9;
        this.f23186X = termsConditionAcceptance;
        this.f23187Y = privacyPolicyAcceptance;
        this.f23188Z = marketingMessagesOption;
        this.f23183L0 = z10;
        this.f23184M0 = z11;
        this.f23185N0 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b421)) {
            return false;
        }
        b421 b421Var = (b421) obj;
        return this.f23189a == b421Var.f23189a && this.f23190b == b421Var.f23190b && this.f23191c == b421Var.f23191c && this.f23192d == b421Var.f23192d && this.f23193e == b421Var.f23193e && this.f23194f == b421Var.f23194f && this.f23195g == b421Var.f23195g && this.f23196h == b421Var.f23196h && this.f23197i == b421Var.f23197i && this.f23198t == b421Var.f23198t && this.f23186X == b421Var.f23186X && this.f23187Y == b421Var.f23187Y && this.f23188Z == b421Var.f23188Z && this.f23183L0 == b421Var.f23183L0 && this.f23184M0 == b421Var.f23184M0 && wj50.m88271j(this.f23185N0, b421Var.f23185N0);
    }

    public final int hashCode() {
        return this.f23185N0.hashCode() + s571.m77245d(s571.m77245d((this.f23188Z.hashCode() + ((this.f23187Y.hashCode() + ((this.f23186X.hashCode() + s571.m77245d(mt60.m62800g(this.f23197i, s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f23189a) * 31, 31, this.f23190b), 31, this.f23191c), 31, this.f23192d), 31, this.f23193e), 31, this.f23194f), 31, this.f23195g), 31, this.f23196h), 31), 31, this.f23198t)) * 31)) * 31)) * 31, 31, this.f23183L0), 31, this.f23184M0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23189a ? 1 : 0);
        parcel.writeInt(this.f23190b ? 1 : 0);
        parcel.writeInt(this.f23191c ? 1 : 0);
        parcel.writeInt(this.f23192d ? 1 : 0);
        parcel.writeInt(this.f23193e ? 1 : 0);
        parcel.writeInt(this.f23194f ? 1 : 0);
        parcel.writeInt(this.f23195g ? 1 : 0);
        parcel.writeInt(this.f23196h ? 1 : 0);
        parcel.writeInt(this.f23197i);
        parcel.writeInt(this.f23198t ? 1 : 0);
        parcel.writeString(this.f23186X.name());
        parcel.writeString(this.f23187Y.name());
        parcel.writeString(this.f23188Z.name());
        parcel.writeInt(this.f23183L0 ? 1 : 0);
        parcel.writeInt(this.f23184M0 ? 1 : 0);
        parcel.writeString(this.f23185N0);
    }

    public /* synthetic */ b421(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, boolean z7, TermsConditionAcceptance termsConditionAcceptance, PrivacyPolicyAcceptance privacyPolicyAcceptance, MarketingMessagesOption marketingMessagesOption, boolean z8, boolean z9, String str, int i2) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, false, (i2 & 32) != 0 ? false : z5, (i2 & 64) != 0 ? false : z6, false, (i2 & 256) != 0 ? 13 : i, (i2 & 512) != 0 ? false : z7, (i2 & 1024) != 0 ? TermsConditionAcceptance.EXPLICIT : termsConditionAcceptance, (i2 & 2048) != 0 ? PrivacyPolicyAcceptance.EXPLICIT : privacyPolicyAcceptance, (i2 & 4096) != 0 ? MarketingMessagesOption.OPT_IN : marketingMessagesOption, (i2 & 8192) != 0 ? false : z8, (i2 & 16384) != 0 ? false : z9, (i2 & 32768) != 0 ? "" : str);
    }
}
