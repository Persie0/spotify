package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.p194v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class fuz0 implements Parcelable {
    public static final Parcelable.Creator<fuz0> CREATOR = new vcz0(11);

    /* JADX INFO: renamed from: a */
    public final byte[] f73606a;

    /* JADX INFO: renamed from: b */
    public final transient wg61 f73607b = new wg61(new ohy0(this, 16));

    public fuz0(byte[] bArr) {
        this.f73606a = bArr;
    }

    /* JADX INFO: renamed from: c */
    public final wrm0 m42753c(pl80 pl80Var, xq00 xq00Var, int i) {
        pl80 ol80Var = (i & 1) != 0 ? nl80.f155023a : pl80Var;
        Paragraph paragraph = (Paragraph) this.f73607b.getValue();
        int iM23158v = paragraph.m23158v();
        int i2 = iM23158v == 0 ? -1 : tsm0.f223382a[edb.m38547C(iM23158v)];
        if (i2 == 1) {
            xq00Var.m91771i0(1020868711);
            Paragraph.Hero heroM23153q = paragraph.m23153q();
            if71 if71VarM83910i = usm0.m83910i(heroM23153q.m23174r(), xq00Var);
            if (heroM23153q.m23173q() > 0) {
                ol80Var = new ol80(heroM23153q.m23173q());
            }
            pl80 pl80Var2 = ol80Var;
            String strM23203u = heroM23153q.m23174r().m23203u();
            long jM83903b = usm0.m83903b(heroM23153q.m23174r().m23205w());
            bsm0 bsm0VarM83905d = usm0.m83905d(heroM23153q.m23176t());
            Paragraph.AutoSize autoSizeM23171n = heroM23153q.m23171n();
            wrm0 wrm0Var = new wrm0(strM23203u, if71VarM83910i, new gsm0(bsm0VarM83905d, (autoSizeM23171n.m23162q() == 0.0f && autoSizeM23171n.m23161p() == 0.0f) ? csm0.f41656a : new dsm0(autoSizeM23171n.m23162q(), autoSizeM23171n.m23161p(), epv0.m39702v(autoSizeM23171n.m23160n())), pl80Var2, usm0.m83902a(heroM23153q.m23172o()), heroM23153q.m23175s(), 16), jM83903b, null);
            xq00Var.m91788r(false);
            return wrm0Var;
        }
        if (i2 == 2) {
            xq00Var.m91771i0(1020870855);
            Paragraph.Single singleM23155s = paragraph.m23155s();
            if71 if71VarM83910i2 = usm0.m83910i(singleM23155s.m23192s(), xq00Var);
            if (singleM23155s.m23191r() > 0) {
                ol80Var = new ol80(singleM23155s.m23191r());
            }
            wrm0 wrm0Var2 = new wrm0(singleM23155s.m23192s().m23203u(), if71VarM83910i2, new gsm0(usm0.m83905d(singleM23155s.m23194u()), null, ol80Var, usm0.m83902a(singleM23155s.m23190p()), singleM23155s.m23193t(), 18), usm0.m83903b(singleM23155s.m23192s().m23205w()), usm0.m83906e(singleM23155s.m23189o()));
            xq00Var.m91788r(false);
            return wrm0Var2;
        }
        if (i2 != 3) {
            xq00Var.m91771i0(1020873965);
            if71 if71VarM83910i3 = usm0.m83910i(paragraph.m23156t(), xq00Var);
            xq00Var.m91771i0(586233347);
            ae50<Paragraph.TextStyle> ae50VarM23157u = paragraph.m23157u();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM23157u, 10));
            for (Paragraph.TextStyle textStyle : ae50VarM23157u) {
                arrayList.add(new jsm0(textStyle.m23203u(), usm0.m83909h(textStyle, xq00Var)));
            }
            xq00Var.m91788r(false);
            wrm0 wrm0Var3 = new wrm0(paragraph.m23156t().m23203u(), if71VarM83910i3, arrayList.isEmpty() ? new gsm0(null, null, ol80Var, null, 0.0f, 59) : new fsm0(arrayList, null, ol80Var, 6), usm0.m83903b(paragraph.m23156t().m23205w()), null);
            xq00Var.m91788r(false);
            return wrm0Var3;
        }
        xq00Var.m91771i0(1020872935);
        Paragraph.Multi multiM23154r = paragraph.m23154r();
        if71 if71VarM83910i4 = usm0.m83910i(multiM23154r.m23184t(), xq00Var);
        if (multiM23154r.m23183s() > 0) {
            ol80Var = new ol80(multiM23154r.m23183s());
        }
        xq00Var.m91771i0(62978677);
        ae50<Paragraph.TextStyle> ae50VarM23185u = multiM23154r.m23185u();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM23185u, 10));
        for (Paragraph.TextStyle textStyle2 : ae50VarM23185u) {
            arrayList2.add(new jsm0(textStyle2.m23203u(), usm0.m83909h(textStyle2, xq00Var)));
        }
        xq00Var.m91788r(false);
        wrm0 wrm0Var4 = new wrm0(multiM23154r.m23184t().m23203u(), if71VarM83910i4, new fsm0(arrayList2, usm0.m83902a(multiM23154r.m23182q()), ol80Var, 4), usm0.m83903b(multiM23154r.m23184t().m23205w()), usm0.m83906e(multiM23154r.m23181p()));
        xq00Var.m91788r(false);
        return wrm0Var4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (fuz0.class.equals(obj != null ? obj.getClass() : null)) {
            return Arrays.equals(this.f73606a, ((fuz0) obj).f73606a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f73606a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f73606a);
    }
}
