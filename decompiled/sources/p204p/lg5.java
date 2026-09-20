package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lg5 extends AbstractC2206o9 {
    public static final Parcelable.Creator<lg5> CREATOR = new nlf1(15);

    /* JADX INFO: renamed from: a */
    public final String f133080a;

    /* JADX INFO: renamed from: b */
    public final String f133081b;

    /* JADX INFO: renamed from: c */
    public final List f133082c;

    /* JADX INFO: renamed from: d */
    public final String f133083d;

    /* JADX INFO: renamed from: e */
    public final Uri f133084e;

    /* JADX INFO: renamed from: f */
    public final String f133085f;

    /* JADX INFO: renamed from: g */
    public final String f133086g;

    /* JADX INFO: renamed from: h */
    public final Boolean f133087h;

    /* JADX INFO: renamed from: i */
    public final Boolean f133088i;

    /* JADX INFO: renamed from: t */
    public final int f133089t;

    public lg5(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2, int i) {
        this.f133080a = str;
        this.f133081b = str2;
        this.f133082c = arrayList;
        this.f133083d = str3;
        this.f133084e = uri;
        this.f133085f = str4;
        this.f133086g = str5;
        this.f133087h = bool;
        this.f133088i = bool2;
        this.f133089t = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lg5)) {
            return false;
        }
        lg5 lg5Var = (lg5) obj;
        return acc.m25453c(this.f133080a, lg5Var.f133080a) && acc.m25453c(this.f133081b, lg5Var.f133081b) && acc.m25453c(this.f133082c, lg5Var.f133082c) && acc.m25453c(this.f133083d, lg5Var.f133083d) && acc.m25453c(this.f133084e, lg5Var.f133084e) && acc.m25453c(this.f133085f, lg5Var.f133085f) && acc.m25453c(this.f133086g, lg5Var.f133086g) && this.f133089t == lg5Var.f133089t;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f133080a, this.f133081b, this.f133082c, this.f133083d, this.f133084e, this.f133085f, Integer.valueOf(this.f133089t)});
    }

    public final String toString() {
        List list = this.f133082c;
        int size = list == null ? 0 : list.size();
        String strValueOf = String.valueOf(this.f133084e);
        String str = this.f133080a;
        int length = String.valueOf(str).length();
        String str2 = this.f133081b;
        int length2 = String.valueOf(str2).length() + length + 23;
        int length3 = String.valueOf(size).length();
        String str3 = this.f133083d;
        int length4 = String.valueOf(str3).length() + length2 + 20 + length3 + 23 + 22;
        int length5 = strValueOf.length();
        String str4 = this.f133085f;
        int i = length4 + length5 + 11;
        int length6 = String.valueOf(str4).length();
        String str5 = this.f133086g;
        StringBuilder sb = new StringBuilder(i + length6 + 8 + String.valueOf(str5).length());
        klh.m56844p(sb, "applicationId: ", str, ", name: ", str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        klh.m56844p(sb, ", senderAppLaunchUrl: ", strValueOf, ", iconUrl: ", str4);
        return dq60.m36616p(", type: ", str5, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26308N(parcel, 2, this.f133080a);
        alf1.m26308N(parcel, 3, this.f133081b);
        alf1.m26310P(parcel, 5, Collections.unmodifiableList(this.f133082c));
        alf1.m26308N(parcel, 6, this.f133083d);
        alf1.m26307M(parcel, 7, this.f133084e, i);
        alf1.m26308N(parcel, 8, this.f133085f);
        alf1.m26308N(parcel, 9, this.f133086g);
        alf1.m26296B(parcel, 10, this.f133087h);
        alf1.m26296B(parcel, 11, this.f133088i);
        alf1.m26313S(parcel, 12, 4);
        parcel.writeInt(this.f133089t);
        alf1.m26316V(iM26314T, parcel);
    }
}
