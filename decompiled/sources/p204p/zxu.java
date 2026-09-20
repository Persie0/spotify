package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class zxu extends AbstractC2202o5 {
    public static final Parcelable.ClassLoaderCreator<zxu> CREATOR = new fb31(9);

    /* JADX INFO: renamed from: c */
    public iyu f287394c;

    /* JADX INFO: renamed from: d */
    public ysx0 f287395d;

    /* JADX INFO: renamed from: e */
    public String f287396e;

    public zxu(Parcelable parcelable) {
        super(parcelable);
        this.f287394c = iyu.LARGE;
        this.f287395d = ysx0.Regular;
        this.f287396e = "";
    }

    /* JADX INFO: renamed from: g */
    public final iyu m97210g() {
        return this.f287394c;
    }

    /* JADX INFO: renamed from: h */
    public final String m97211h() {
        return this.f287396e;
    }

    /* JADX INFO: renamed from: j */
    public final ysx0 m97212j() {
        return this.f287395d;
    }

    /* JADX INFO: renamed from: k */
    public final void m97213k(iyu iyuVar) {
        this.f287394c = iyuVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m97214l(String str) {
        this.f287396e = str;
    }

    /* JADX INFO: renamed from: m */
    public final void m97215m(ysx0 ysx0Var) {
        this.f287395d = ysx0Var;
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f161807a, i);
        parcel.writeInt(this.f287394c.ordinal());
        parcel.writeInt(this.f287395d.ordinal());
        parcel.writeString(this.f287396e);
    }

    public zxu(Parcel parcel, ClassLoader classLoader) {
        ysx0 ysx0Var;
        iyu iyuVar;
        super(parcel, classLoader);
        iyu iyuVar2 = iyu.LARGE;
        this.f287394c = iyuVar2;
        ysx0 ysx0Var2 = ysx0.Regular;
        this.f287395d = ysx0Var2;
        this.f287396e = "";
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        iyu[] iyuVarArrValues = iyu.values();
        int length = iyuVarArrValues.length;
        int i3 = 0;
        while (true) {
            ysx0Var = null;
            if (i3 >= length) {
                iyuVar = null;
                break;
            }
            iyuVar = iyuVarArrValues[i3];
            if (iyuVar.ordinal() == i) {
                break;
            } else {
                i3++;
            }
        }
        this.f287394c = iyuVar != null ? iyuVar : iyuVar2;
        for (ysx0 ysx0Var3 : ysx0.values()) {
            if (ysx0Var3.ordinal() == i2) {
                ysx0Var = ysx0Var3;
                break;
            }
        }
        this.f287395d = ysx0Var != null ? ysx0Var : ysx0Var2;
        String string = parcel.readString();
        this.f287396e = string == null ? "1:1" : string;
    }
}
