package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zi8 implements Parcelable {
    public static final Parcelable.Creator<zi8> CREATOR = new yi8(0);

    /* JADX INFO: renamed from: L0 */
    public final boolean f283102L0;

    /* JADX INFO: renamed from: X */
    public final CharSequence f283103X;

    /* JADX INFO: renamed from: Y */
    public final ArrayList f283104Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f283105Z;

    /* JADX INFO: renamed from: a */
    public final int[] f283106a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f283107b;

    /* JADX INFO: renamed from: c */
    public final int[] f283108c;

    /* JADX INFO: renamed from: d */
    public final int[] f283109d;

    /* JADX INFO: renamed from: e */
    public final int f283110e;

    /* JADX INFO: renamed from: f */
    public final String f283111f;

    /* JADX INFO: renamed from: g */
    public final int f283112g;

    /* JADX INFO: renamed from: h */
    public final int f283113h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f283114i;

    /* JADX INFO: renamed from: t */
    public final int f283115t;

    public zi8(xi8 xi8Var) {
        int size = xi8Var.f261795c.size();
        this.f283106a = new int[size * 6];
        if (!xi8Var.f261801i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f283107b = new ArrayList(size);
        this.f283108c = new int[size];
        this.f283109d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j800 j800Var = (j800) xi8Var.f261795c.get(i2);
            int i3 = i + 1;
            this.f283106a[i] = j800Var.f109750a;
            ArrayList arrayList = this.f283107b;
            i500 i500Var = j800Var.f109751b;
            arrayList.add(i500Var != null ? i500Var.f98699e : null);
            int[] iArr = this.f283106a;
            iArr[i3] = j800Var.f109752c ? 1 : 0;
            iArr[i + 2] = j800Var.f109753d;
            iArr[i + 3] = j800Var.f109754e;
            int i4 = i + 5;
            iArr[i + 4] = j800Var.f109755f;
            i += 6;
            iArr[i4] = j800Var.f109756g;
            this.f283108c[i2] = j800Var.f109757h.ordinal();
            this.f283109d[i2] = j800Var.f109758i.ordinal();
        }
        this.f283110e = xi8Var.f261800h;
        this.f283111f = xi8Var.f261803k;
        this.f283112g = xi8Var.f261814v;
        this.f283113h = xi8Var.f261804l;
        this.f283114i = xi8Var.f261805m;
        this.f283115t = xi8Var.f261806n;
        this.f283103X = xi8Var.f261807o;
        this.f283104Y = xi8Var.f261808p;
        this.f283105Z = xi8Var.f261809q;
        this.f283102L0 = xi8Var.f261810r;
    }

    /* JADX INFO: renamed from: c */
    public final void m96201c(xi8 xi8Var) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f283106a;
            boolean z = true;
            if (i >= iArr.length) {
                xi8Var.f261800h = this.f283110e;
                xi8Var.f261803k = this.f283111f;
                xi8Var.f261801i = true;
                xi8Var.f261804l = this.f283113h;
                xi8Var.f261805m = this.f283114i;
                xi8Var.f261806n = this.f283115t;
                xi8Var.f261807o = this.f283103X;
                xi8Var.f261808p = this.f283104Y;
                xi8Var.f261809q = this.f283105Z;
                xi8Var.f261810r = this.f283102L0;
                return;
            }
            j800 j800Var = new j800();
            int i3 = i + 1;
            j800Var.f109750a = iArr[i];
            if (c700.m31595O(2)) {
                Objects.toString(xi8Var);
                int i4 = iArr[i3];
            }
            j800Var.f109757h = fb80.values()[this.f283108c[i2]];
            j800Var.f109758i = fb80.values()[this.f283109d[i2]];
            int i5 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            j800Var.f109752c = z;
            int i6 = iArr[i5];
            j800Var.f109753d = i6;
            int i7 = iArr[i + 3];
            j800Var.f109754e = i7;
            int i8 = i + 5;
            int i9 = iArr[i + 4];
            j800Var.f109755f = i9;
            i += 6;
            int i10 = iArr[i8];
            j800Var.f109756g = i10;
            xi8Var.f261796d = i6;
            xi8Var.f261797e = i7;
            xi8Var.f261798f = i9;
            xi8Var.f261799g = i10;
            xi8Var.m91091b(j800Var);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final xi8 m96202g(c700 c700Var) {
        xi8 xi8Var = new xi8(c700Var);
        m96201c(xi8Var);
        xi8Var.f261814v = this.f283112g;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f283107b;
            if (i >= arrayList.size()) {
                xi8Var.m91093d(1);
                return xi8Var;
            }
            String str = (String) arrayList.get(i);
            if (str != null) {
                ((j800) xi8Var.f261795c.get(i)).f109751b = c700Var.f34668c.m89872s(str);
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f283106a);
        parcel.writeStringList(this.f283107b);
        parcel.writeIntArray(this.f283108c);
        parcel.writeIntArray(this.f283109d);
        parcel.writeInt(this.f283110e);
        parcel.writeString(this.f283111f);
        parcel.writeInt(this.f283112g);
        parcel.writeInt(this.f283113h);
        TextUtils.writeToParcel(this.f283114i, parcel, 0);
        parcel.writeInt(this.f283115t);
        TextUtils.writeToParcel(this.f283103X, parcel, 0);
        parcel.writeStringList(this.f283104Y);
        parcel.writeStringList(this.f283105Z);
        parcel.writeInt(this.f283102L0 ? 1 : 0);
    }

    public zi8(Parcel parcel) {
        this.f283106a = parcel.createIntArray();
        this.f283107b = parcel.createStringArrayList();
        this.f283108c = parcel.createIntArray();
        this.f283109d = parcel.createIntArray();
        this.f283110e = parcel.readInt();
        this.f283111f = parcel.readString();
        this.f283112g = parcel.readInt();
        this.f283113h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f283114i = (CharSequence) creator.createFromParcel(parcel);
        this.f283115t = parcel.readInt();
        this.f283103X = (CharSequence) creator.createFromParcel(parcel);
        this.f283104Y = parcel.createStringArrayList();
        this.f283105Z = parcel.createStringArrayList();
        this.f283102L0 = parcel.readInt() != 0;
    }
}
