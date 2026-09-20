package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class kn70 extends AbstractC2206o9 {
    public static final Parcelable.Creator<kn70> CREATOR = new c5f1(25);

    /* JADX INFO: renamed from: a */
    public boolean f124320a;

    /* JADX INFO: renamed from: b */
    public final String f124321b;

    /* JADX INFO: renamed from: c */
    public boolean f124322c;

    /* JADX INFO: renamed from: d */
    public final csl f124323d;

    public kn70() {
        Locale locale = Locale.getDefault();
        Pattern pattern = acc.f14312a;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        this(false, sb.toString(), false, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kn70)) {
            return false;
        }
        kn70 kn70Var = (kn70) obj;
        return this.f124320a == kn70Var.f124320a && acc.m25453c(this.f124321b, kn70Var.f124321b) && this.f124322c == kn70Var.f124322c && acc.m25453c(this.f124323d, kn70Var.f124323d);
    }

    public final int hashCode() {
        return mvl0.m62961x(Boolean.valueOf(this.f124320a), this.f124321b, Boolean.valueOf(this.f124322c), this.f124323d);
    }

    public final String toString() {
        boolean z = this.f124320a;
        boolean z2 = this.f124322c;
        StringBuilder sb = new StringBuilder("LaunchOptions(relaunchIfRunning=");
        sb.append(z);
        sb.append(", language=");
        sb.append(this.f124321b);
        sb.append(", androidReceiverCompatible: ");
        return edb.m38570s(sb, z2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26295A(parcel, 2, this.f124320a);
        alf1.m26308N(parcel, 3, this.f124321b);
        alf1.m26295A(parcel, 4, this.f124322c);
        alf1.m26307M(parcel, 5, this.f124323d, i);
        alf1.m26331n(iM26329l, parcel);
    }

    public kn70(boolean z, String str, boolean z2, csl cslVar) {
        this.f124320a = z;
        this.f124321b = str;
        this.f124322c = z2;
        this.f124323d = cslVar;
    }
}
