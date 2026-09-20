package p204p;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tbn0 implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final String f218907b = File.separator;

    /* JADX INFO: renamed from: a */
    public final iva f218908a;

    public tbn0(iva ivaVar) {
        this.f218908a = ivaVar;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m80399a() {
        ArrayList arrayList = new ArrayList();
        int iM31058a = AbstractC1723c.m31058a(this);
        iva ivaVar = this.f218908a;
        if (iM31058a == -1) {
            iM31058a = 0;
        } else if (iM31058a < ivaVar.mo51747d() && ivaVar.mo51751i(iM31058a) == 92) {
            iM31058a++;
        }
        int iMo51747d = ivaVar.mo51747d();
        int i = iM31058a;
        while (iM31058a < iMo51747d) {
            if (ivaVar.mo51751i(iM31058a) == 47 || ivaVar.mo51751i(iM31058a) == 92) {
                arrayList.add(ivaVar.mo51756n(i, iM31058a));
                i = iM31058a + 1;
            }
            iM31058a++;
        }
        if (i < ivaVar.mo51747d()) {
            arrayList.add(ivaVar.mo51756n(i, ivaVar.mo51747d()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final String m80400b() {
        iva ivaVar = AbstractC1723c.f32631a;
        iva ivaVarM51743o = this.f218908a;
        ivaVarM51743o.getClass();
        int iMo51752j = ivaVarM51743o.mo51752j(ivaVar.mo51750h());
        if (iMo51752j == -1) {
            iva ivaVar2 = AbstractC1723c.f32632b;
            ivaVarM51743o.getClass();
            iMo51752j = ivaVarM51743o.mo51752j(ivaVar2.mo51750h());
        }
        if (iMo51752j != -1) {
            ivaVarM51743o = iva.m51743o(ivaVarM51743o, iMo51752j + 1, 0, 2);
        } else if (m80404f() != null && ivaVarM51743o.mo51747d() == 2) {
            ivaVarM51743o = iva.f106177d;
        }
        return ivaVarM51743o.m51759r();
    }

    /* JADX INFO: renamed from: c */
    public final tbn0 m80401c() {
        iva ivaVar = AbstractC1723c.f32634d;
        iva ivaVar2 = this.f218908a;
        if (wj50.m88271j(ivaVar2, ivaVar)) {
            return null;
        }
        iva ivaVar3 = AbstractC1723c.f32631a;
        if (wj50.m88271j(ivaVar2, ivaVar3)) {
            return null;
        }
        iva ivaVar4 = AbstractC1723c.f32632b;
        if (wj50.m88271j(ivaVar2, ivaVar4)) {
            return null;
        }
        iva ivaVar5 = AbstractC1723c.f32635e;
        int iMo51747d = ivaVar2.mo51747d();
        byte[] bArr = ivaVar5.f106178a;
        if (ivaVar2.mo51753k(iMo51747d - bArr.length, ivaVar5, bArr.length) && (ivaVar2.mo51747d() == 2 || ivaVar2.mo51753k(ivaVar2.mo51747d() - 3, ivaVar3, 1) || ivaVar2.mo51753k(ivaVar2.mo51747d() - 3, ivaVar4, 1))) {
            return null;
        }
        ivaVar2.getClass();
        int iMo51752j = ivaVar2.mo51752j(ivaVar3.mo51750h());
        if (iMo51752j == -1) {
            ivaVar2.getClass();
            iMo51752j = ivaVar2.mo51752j(ivaVar4.mo51750h());
        }
        if (iMo51752j == 2 && m80404f() != null) {
            if (ivaVar2.mo51747d() == 3) {
                return null;
            }
            return new tbn0(iva.m51743o(ivaVar2, 0, 3, 1));
        }
        if (iMo51752j == 1 && ivaVar2.mo51753k(0, ivaVar4, ivaVar4.mo51747d())) {
            return null;
        }
        if (iMo51752j != -1 || m80404f() == null) {
            if (iMo51752j == -1) {
                return new tbn0(ivaVar);
            }
            return iMo51752j == 0 ? new tbn0(iva.m51743o(ivaVar2, 0, 1, 1)) : new tbn0(iva.m51743o(ivaVar2, 0, iMo51752j, 1));
        }
        if (ivaVar2.mo51747d() == 2) {
            return null;
        }
        return new tbn0(iva.m51743o(ivaVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f218908a.compareTo(((tbn0) obj).f218908a);
    }

    /* JADX INFO: renamed from: d */
    public final tbn0 m80402d(tbn0 tbn0Var) {
        iva ivaVar = tbn0Var.f218908a;
        int iM31058a = AbstractC1723c.m31058a(this);
        iva ivaVar2 = this.f218908a;
        tbn0 tbn0Var2 = iM31058a == -1 ? null : new tbn0(ivaVar2.mo51756n(0, iM31058a));
        int iM31058a2 = AbstractC1723c.m31058a(tbn0Var);
        if (!wj50.m88271j(tbn0Var2, iM31058a2 != -1 ? new tbn0(tbn0Var.f218908a.mo51756n(0, iM31058a2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + tbn0Var).toString());
        }
        ArrayList arrayListM80399a = m80399a();
        ArrayList arrayListM80399a2 = tbn0Var.m80399a();
        int iMin = Math.min(arrayListM80399a.size(), arrayListM80399a2.size());
        int i = 0;
        while (i < iMin && wj50.m88271j(arrayListM80399a.get(i), arrayListM80399a2.get(i))) {
            i++;
        }
        if (i == iMin && ivaVar2.mo51747d() == ivaVar.mo51747d()) {
            return qbn0.m72505f(".");
        }
        if (arrayListM80399a2.subList(i, arrayListM80399a2.size()).indexOf(AbstractC1723c.f32635e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + tbn0Var).toString());
        }
        if (wj50.m88271j(ivaVar, AbstractC1723c.f32634d)) {
            return this;
        }
        npa npaVar = new npa();
        iva ivaVarM31060c = AbstractC1723c.m31060c(tbn0Var);
        if (ivaVarM31060c == null && (ivaVarM31060c = AbstractC1723c.m31060c(this)) == null) {
            ivaVarM31060c = AbstractC1723c.m31063f(f218907b);
        }
        int size = arrayListM80399a2.size();
        for (int i2 = i; i2 < size; i2++) {
            npaVar.m65297I(AbstractC1723c.f32635e);
            npaVar.m65297I(ivaVarM31060c);
        }
        int size2 = arrayListM80399a.size();
        while (i < size2) {
            npaVar.m65297I((iva) arrayListM80399a.get(i));
            npaVar.m65297I(ivaVarM31060c);
            i++;
        }
        return AbstractC1723c.m31061d(npaVar, false);
    }

    /* JADX INFO: renamed from: e */
    public final tbn0 m80403e(String str) {
        npa npaVar = new npa();
        npaVar.m65304Q(str);
        return AbstractC1723c.m31059b(this, AbstractC1723c.m31061d(npaVar, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tbn0) && wj50.m88271j(((tbn0) obj).f218908a, this.f218908a);
    }

    /* JADX INFO: renamed from: f */
    public final Character m80404f() {
        iva ivaVar = AbstractC1723c.f32631a;
        iva ivaVar2 = this.f218908a;
        if (iva.m51742g(ivaVar2, ivaVar) != -1 || ivaVar2.mo51747d() < 2 || ivaVar2.mo51751i(1) != 58) {
            return null;
        }
        char cMo51751i = (char) ivaVar2.mo51751i(0);
        if (('a' > cMo51751i || cMo51751i >= '{') && ('A' > cMo51751i || cMo51751i >= '[')) {
            return null;
        }
        return Character.valueOf(cMo51751i);
    }

    public final int hashCode() {
        return this.f218908a.hashCode();
    }

    public final File toFile() {
        return new File(this.f218908a.m51759r());
    }

    public final String toString() {
        return this.f218908a.m51759r();
    }
}
