package p204p;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes11.dex */
public final class oh41 implements zpq {

    /* JADX INFO: renamed from: a */
    public final char f165337a;

    /* JADX INFO: renamed from: b */
    public int f165338b = 0;

    /* JADX INFO: renamed from: c */
    public final LinkedList f165339c = new LinkedList();

    public oh41(char c) {
        this.f165337a = c;
    }

    @Override // p204p.zpq
    /* JADX INFO: renamed from: a */
    public final int mo26266a(ypq ypqVar, ypq ypqVar2) {
        int size = ypqVar.f275003a.size();
        LinkedList<zpq> linkedList = this.f165339c;
        for (zpq zpqVar : linkedList) {
            if (zpqVar.mo26268c() <= size) {
                return zpqVar.mo26266a(ypqVar, ypqVar2);
            }
        }
        zpqVar = (zpq) linkedList.getFirst();
        return zpqVar.mo26266a(ypqVar, ypqVar2);
    }

    @Override // p204p.zpq
    /* JADX INFO: renamed from: b */
    public final char mo26267b() {
        return this.f165337a;
    }

    @Override // p204p.zpq
    /* JADX INFO: renamed from: c */
    public final int mo26268c() {
        return this.f165338b;
    }

    @Override // p204p.zpq
    /* JADX INFO: renamed from: d */
    public final char mo26269d() {
        return this.f165337a;
    }

    /* JADX INFO: renamed from: e */
    public final void m66925e(zpq zpqVar) {
        int iMo26268c = zpqVar.mo26268c();
        LinkedList linkedList = this.f165339c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            zpq zpqVar2 = (zpq) listIterator.next();
            int iMo26268c2 = zpqVar2.mo26268c();
            if (iMo26268c > iMo26268c2) {
                listIterator.previous();
                listIterator.add(zpqVar);
                return;
            } else if (iMo26268c == iMo26268c2) {
                String strValueOf = String.valueOf(zpqVar2);
                String strValueOf2 = String.valueOf(zpqVar);
                StringBuilder sb = new StringBuilder("Cannot add two delimiter processors for char '");
                sb.append(this.f165337a);
                sb.append("' and minimum length ");
                sb.append(iMo26268c);
                sb.append("; conflicting processors: ");
                throw new IllegalArgumentException(dq60.m36618r(sb, strValueOf, ", ", strValueOf2));
            }
        }
        linkedList.add(zpqVar);
        this.f165338b = iMo26268c;
    }
}
