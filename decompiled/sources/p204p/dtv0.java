package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class dtv0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object[] f52911a;

    /* JADX INFO: renamed from: b */
    public final int[] f52912b;

    public dtv0(etv0 etv0Var) {
        int size = etv0Var.m38771m().size();
        this.f52911a = new Object[size];
        this.f52912b = new int[size];
        int i = 0;
        for (xlk0 xlk0Var : etv0Var.m38771m()) {
            this.f52911a[i] = xlk0Var.f263159a;
            this.f52912b[i] = xlk0Var.m91436a();
            i++;
        }
    }

    public Object readResolve() {
        Object[] objArr = this.f52911a;
        int length = objArr.length;
        ylk0 ylk0Var = new ylk0();
        ylk0Var.m94167d(length);
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            int i2 = this.f52912b[i];
            if (i2 != 0) {
                obj.getClass();
                ylk0Var.m94168e(ylk0Var.m94165b(obj) + i2, obj);
            }
        }
        if (ylk0Var.f274039c != 0) {
            return new etv0(ylk0Var);
        }
        int i3 = eg40.f59211d;
        return etv0.f62810h;
    }
}
