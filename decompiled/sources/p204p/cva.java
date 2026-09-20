package p204p;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class cva extends gva {

    /* JADX INFO: renamed from: d */
    public final byte[] f42342d;

    public cva(byte[] bArr) {
        this.f84680a = 0;
        bArr.getClass();
        this.f42342d = bArr;
    }

    @Override // p204p.gva
    /* JADX INFO: renamed from: a */
    public byte mo34014a(int i) {
        return this.f42342d[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gva) || size() != ((gva) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof cva)) {
            return obj.equals(this);
        }
        cva cvaVar = (cva) obj;
        int i = this.f84680a;
        int i2 = cvaVar.f84680a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > cvaVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > cvaVar.size()) {
            throw new IllegalArgumentException(s571.m77247f(size, "Ran off end of other: 0, ", cvaVar.size(), ", "));
        }
        byte[] bArr = cvaVar.f42342d;
        int iMo34024w = mo34024w() + size;
        int iMo34024w2 = mo34024w();
        int iMo34024w3 = cvaVar.mo34024w();
        while (iMo34024w2 < iMo34024w) {
            if (this.f42342d[iMo34024w2] != bArr[iMo34024w3]) {
                return false;
            }
            iMo34024w2++;
            iMo34024w3++;
        }
        return true;
    }

    @Override // p204p.gva
    /* JADX INFO: renamed from: i */
    public void mo34015i(byte[] bArr, int i) {
        System.arraycopy(this.f42342d, 0, bArr, 0, i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new sua(this);
    }

    @Override // p204p.gva
    /* JADX INFO: renamed from: m */
    public byte mo34016m(int i) {
        return this.f42342d[i];
    }

    @Override // p204p.gva
    /* JADX INFO: renamed from: n */
    public final boolean mo34017n() {
        int iMo34024w = mo34024w();
        return yza1.f277744a.m87611n(iMo34024w, this.f42342d, size() + iMo34024w);
    }

    @Override // p204p.gva
    /* JADX INFO: renamed from: o */
    public final owe mo34018o() {
        return owe.m68166f(this.f42342d, mo34024w(), size(), true);
    }

    @Override // p204p.gva
    /* JADX INFO: renamed from: p */
    public final InputStream mo34019p() {
        return new ByteArrayInputStream(this.f42342d, mo34024w(), size());
    }

    @Override // p204p.gva
    /* JADX INFO: renamed from: q */
    public final int mo34020q(int i, int i2) {
        int iMo34024w = mo34024w();
        Charset charset = ee50.f58680a;
        for (int i3 = iMo34024w; i3 < iMo34024w + i2; i3++) {
            i = (i * 31) + this.f42342d[i3];
        }
        return i;
    }

    @Override // p204p.gva
    /* JADX INFO: renamed from: r */
    public final gva mo34021r(int i) {
        int iM45885b = gva.m45885b(0, i, size());
        return iM45885b == 0 ? gva.f84678b : new uua(this.f42342d, mo34024w(), iM45885b);
    }

    @Override // p204p.gva
    public int size() {
        return this.f42342d.length;
    }

    @Override // p204p.gva
    /* JADX INFO: renamed from: t */
    public final String mo34022t(Charset charset) {
        return new String(this.f42342d, mo34024w(), size(), charset);
    }

    @Override // p204p.gva
    /* JADX INFO: renamed from: v */
    public final void mo34023v(uwe uweVar) {
        uweVar.mo74054H(mo34024w(), this.f42342d, size());
    }

    /* JADX INFO: renamed from: w */
    public int mo34024w() {
        return 0;
    }
}
