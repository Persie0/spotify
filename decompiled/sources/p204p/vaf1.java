package p204p;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class vaf1 {
    protected int zza;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m85079a(Iterable iterable, List list) {
        Charset charset = nnf1.f156416a;
        iterable.getClass();
        if (iterable instanceof nof1) {
            List listZzh = ((nof1) iterable).zzh();
            nof1 nof1Var = (nof1) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    String str = "Element at index " + (nof1Var.size() - size) + " is null.";
                    int size2 = nof1Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        nof1Var.remove(size2);
                    }
                } else if (obj instanceof zhf1) {
                    nof1Var.mo49187n1((zhf1) obj);
                } else {
                    nof1Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof gtf1) {
            list.addAll(iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(str2);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }
}
