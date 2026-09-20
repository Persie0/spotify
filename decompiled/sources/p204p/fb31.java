package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class fb31 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67702a;

    /* JADX INFO: renamed from: a */
    public static gb31 m41203a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = fb31.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new gb31();
        }
        isn0 isn0VarMo45653f = mv21.f147495b.mo45653f();
        for (int i2 = 0; i2 < i; i2++) {
            isn0VarMo45653f.add(parcel.readValue(classLoader));
        }
        return new gb31(isn0VarMo45653f.m51557d());
    }

    /* JADX INFO: renamed from: b */
    public static nb31 m41204b(Parcel parcel, ClassLoader classLoader) {
        nb31 nb31Var = new nb31();
        if (classLoader == null) {
            classLoader = nb31.class.getClassLoader();
        }
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            nb31Var.add(parcel.readValue(classLoader));
        }
        return nb31Var;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f67702a) {
            case 0:
                return m41203a(parcel, null);
            case 1:
                return new xy8(parcel, null);
            case 2:
                return new hba(parcel, null);
            case 3:
                return new nyd(parcel, null);
            case 4:
                return new iqk(parcel, null);
            case 5:
                return new ywp(parcel, zwp.class.getClassLoader());
            case 6:
                return new mgs(parcel, null);
            case 7:
                return new mgu(parcel, null);
            case 8:
                return new zgu(parcel, null);
            case 9:
                return new zxu(parcel, null);
            case 10:
                return new ezu(parcel, null);
            case 11:
                return new h500(parcel, null);
            case 12:
                return new x2d0(parcel, null);
            case 13:
                return new xjv0(parcel, null);
            case 14:
                return new f3z0(parcel, null);
            case 15:
                return new fbz0(parcel, null);
            case 16:
                return m41204b(parcel, null);
            case 17:
                return new ga71(parcel, null);
            case 18:
                return new m081(parcel, null);
            case 19:
                return new fkc1(parcel, null);
            default:
                nkc1 nkc1Var = new nkc1(parcel, null);
                nkc1Var.f154852a = parcel.readInt();
                nkc1Var.f154853b = parcel.readInt();
                nkc1Var.f154854c = parcel.readParcelable(null);
                return nkc1Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f67702a) {
            case 0:
                return new gb31[i];
            case 1:
                return new xy8[i];
            case 2:
                return new hba[i];
            case 3:
                return new nyd[i];
            case 4:
                return new iqk[i];
            case 5:
                return new ywp[i];
            case 6:
                return new mgs[i];
            case 7:
                return new mgu[i];
            case 8:
                return new zgu[i];
            case 9:
                return new zxu[i];
            case 10:
                return new ezu[i];
            case 11:
                return new h500[i];
            case 12:
                return new x2d0[i];
            case 13:
                return new xjv0[i];
            case 14:
                return new f3z0[i];
            case 15:
                return new fbz0[i];
            case 16:
                return new nb31[i];
            case 17:
                return new ga71[i];
            case 18:
                return new m081[i];
            case 19:
                return new fkc1[i];
            default:
                return new nkc1[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f67702a) {
            case 0:
                return m41203a(parcel, classLoader);
            case 1:
                return new xy8(parcel, classLoader);
            case 2:
                return new hba(parcel, classLoader);
            case 3:
                return new nyd(parcel, classLoader);
            case 4:
                return new iqk(parcel, classLoader);
            case 5:
                return new ywp(parcel, classLoader);
            case 6:
                return new mgs(parcel, classLoader);
            case 7:
                return new mgu(parcel, classLoader);
            case 8:
                return new zgu(parcel, classLoader);
            case 9:
                return new zxu(parcel, classLoader);
            case 10:
                return new ezu(parcel, classLoader);
            case 11:
                return new h500(parcel, classLoader);
            case 12:
                return new x2d0(parcel, classLoader);
            case 13:
                return new xjv0(parcel, classLoader);
            case 14:
                return new f3z0(parcel, classLoader);
            case 15:
                return new fbz0(parcel, classLoader);
            case 16:
                return m41204b(parcel, classLoader);
            case 17:
                return new ga71(parcel, classLoader);
            case 18:
                return new m081(parcel, classLoader);
            case 19:
                return new fkc1(parcel, classLoader);
            default:
                nkc1 nkc1Var = new nkc1(parcel, classLoader);
                nkc1Var.f154852a = parcel.readInt();
                nkc1Var.f154853b = parcel.readInt();
                nkc1Var.f154854c = parcel.readParcelable(classLoader);
                return nkc1Var;
        }
    }
}
