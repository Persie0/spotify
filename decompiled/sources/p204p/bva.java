package p204p;

/* JADX INFO: loaded from: classes.dex */
public class bva extends fva {

    /* JADX INFO: renamed from: d */
    public final byte[] f31316d;

    public bva(byte[] bArr) {
        this.f73741a = 0;
        bArr.getClass();
        this.f31316d = bArr;
    }

    @Override // p204p.fva
    /* JADX INFO: renamed from: a */
    public byte mo30594a(int i) {
        return this.f31316d[i];
    }

    @Override // p204p.fva
    /* JADX INFO: renamed from: e */
    public void mo30595e(byte[] bArr, int i) {
        System.arraycopy(this.f31316d, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fva) || size() != ((fva) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof bva)) {
            return obj.equals(this);
        }
        bva bvaVar = (bva) obj;
        int i = this.f73741a;
        int i2 = bvaVar.f73741a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > bvaVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > bvaVar.size()) {
            StringBuilder sbM56838j = klh.m56838j(size, "Ran off end of other: 0, ", ", ");
            sbM56838j.append(bvaVar.size());
            throw new IllegalArgumentException(sbM56838j.toString());
        }
        byte[] bArr = bvaVar.f31316d;
        int iMo30597j = mo30597j() + size;
        int iMo30597j2 = mo30597j();
        int iMo30597j3 = bvaVar.mo30597j();
        while (iMo30597j2 < iMo30597j) {
            if (this.f31316d[iMo30597j2] != bArr[iMo30597j3]) {
                return false;
            }
            iMo30597j2++;
            iMo30597j3++;
        }
        return true;
    }

    @Override // p204p.fva
    /* JADX INFO: renamed from: f */
    public byte mo30596f(int i) {
        return this.f31316d[i];
    }

    /* JADX INFO: renamed from: j */
    public int mo30597j() {
        return 0;
    }

    @Override // p204p.fva
    public int size() {
        return this.f31316d.length;
    }
}
