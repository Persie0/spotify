package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cpf1 extends ypf1 {

    /* JADX INFO: renamed from: c */
    public static final Class f40554c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // p204p.ypf1
    /* JADX INFO: renamed from: a */
    public final void mo33563a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) czf1.f43554c.m89357m(j, obj);
        if (list instanceof nof1) {
            objUnmodifiableList = ((nof1) list).zze();
        } else {
            if (f40554c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof gtf1) && (list instanceof gnf1)) {
                kbf1 kbf1Var = (kbf1) ((gnf1) list);
                if (kbf1Var.f121199a) {
                    kbf1Var.f121199a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        czf1.m34443h(obj, j, objUnmodifiableList);
    }

    @Override // p204p.ypf1
    /* JADX INFO: renamed from: b */
    public final void mo33564b(Object obj, long j, Object obj2) {
        List list;
        List list2;
        List listZzd;
        wyf1 wyf1Var = czf1.f43554c;
        List list3 = (List) wyf1Var.m89357m(j, obj2);
        int size = list3.size();
        List list4 = (List) wyf1Var.m89357m(j, obj);
        if (list4.isEmpty()) {
            if (list4 instanceof nof1) {
                listZzd = new kof1(size);
            } else {
                listZzd = ((list4 instanceof gtf1) && (list4 instanceof gnf1)) ? ((gnf1) list4).zzd(size) : new ArrayList(size);
            }
            czf1.m34443h(obj, j, listZzd);
            list2 = listZzd;
        } else {
            if (f40554c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                czf1.m34443h(obj, j, arrayList);
                list = arrayList;
            } else if (list4 instanceof hyf1) {
                kof1 kof1Var = new kof1(list4.size() + size);
                kof1Var.addAll(kof1Var.size(), (hyf1) list4);
                czf1.m34443h(obj, j, kof1Var);
                list = kof1Var;
            } else if ((list4 instanceof gtf1) && (list4 instanceof gnf1)) {
                gnf1 gnf1Var = (gnf1) list4;
                if (!((kbf1) gnf1Var).f121199a) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    gnf1 gnf1VarZzd = gnf1Var.zzd(list4.size() + size);
                    czf1.m34443h(obj, j, gnf1VarZzd);
                    list2 = gnf1VarZzd;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        czf1.m34443h(obj, j, list3);
    }
}
