package p204p;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class dxy extends AbstractC1804e7 {

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f54114c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fxy f54115d;

    public dxy(fxy fxyVar) {
        this.f54115d = fxyVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f54114c = arrayDeque;
        File file = fxyVar.f74484a;
        if (file.isDirectory()) {
            arrayDeque.push(m37276b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new bxy(file));
        } else {
            this.f56782a = 2;
        }
    }

    @Override // p204p.AbstractC1804e7
    /* JADX INFO: renamed from: a */
    public final void mo37275a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.f54114c;
            exy exyVar = (exy) arrayDeque.peek();
            if (exyVar == null) {
                file = null;
                break;
            }
            File fileMo27440a = exyVar.mo27440a();
            if (fileMo27440a == null) {
                arrayDeque.pop();
            } else {
                if (fileMo27440a.equals(exyVar.f63872a) || !fileMo27440a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = fileMo27440a;
                    break;
                }
                arrayDeque.push(m37276b(fileMo27440a));
            }
        }
        if (file == null) {
            this.f56782a = 2;
        } else {
            this.f56783b = file;
            this.f56782a = 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final zwy m37276b(File file) {
        int iM38547C = edb.m38547C(this.f54115d.f74485b);
        if (iM38547C == 0) {
            return new cxy(file);
        }
        if (iM38547C == 1) {
            return new axy(file);
        }
        throw new NoWhenBranchMatchedException();
    }
}
