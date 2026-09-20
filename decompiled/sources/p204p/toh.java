package p204p;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class toh implements tja1 {

    /* JADX INFO: renamed from: a */
    public final List f222260a;

    public toh(List list) {
        this.f222260a = list;
    }

    @Override // p204p.tja1
    /* JADX INFO: renamed from: a */
    public final boolean mo40533a(Uri uri) {
        List list = this.f222260a;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((tja1) it.next()).mo40533a(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.tja1
    /* JADX INFO: renamed from: c */
    public final boolean mo40534c(Uri uri) {
        List list = this.f222260a;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((tja1) it.next()).mo40534c(uri)) {
                return true;
            }
        }
        return false;
    }
}
