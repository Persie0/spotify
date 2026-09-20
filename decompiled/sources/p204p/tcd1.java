package p204p;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
public final class tcd1 {

    /* JADX INFO: renamed from: a */
    public final r7i0 f219074a;

    /* JADX INFO: renamed from: b */
    public final s9p0 f219075b;

    /* JADX INFO: renamed from: c */
    public final LinkedList f219076c;

    public tcd1(dcm0 dcm0Var) {
        r7i0 r7i0VarM29061D = bga.m29061D(dcm0Var);
        this.f219074a = r7i0VarM29061D;
        this.f219075b = r7i0VarM29061D.mo43757c(true);
        this.f219076c = new LinkedList();
        hc80 hc80Var = dcm0Var.f47583d.f68149c;
        hc80Var.getLifecycle().mo31986a(new leo0(this, hc80Var, 1));
    }

    /* JADX INFO: renamed from: a */
    public final lg21 m80457a(lg21 lg21Var) {
        s9p0 s9p0Var;
        int i = 0;
        LinkedList linkedList = this.f219076c;
        if (lg21Var != null && !((Boolean) lg21Var.f133058d.f215176b.getValue()).booleanValue()) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (wj50.m88271j((lg21) it.next(), lg21Var)) {
                    break;
                }
                i++;
            }
            if (i != -1 && i != h6f.m46714K(linkedList)) {
                linkedList.add((lg21) linkedList.remove(i));
            }
            return lg21Var;
        }
        linkedList.removeIf(rcd1.f197849c);
        while (true) {
            s9p0Var = this.f219075b;
            u9p0 u9p0Var = s9p0Var.f206994c;
            if ((u9p0Var != null ? u9p0Var.f228247d.m81949a().size() : 0) != 0 || linkedList.isEmpty()) {
                break;
            }
            lg21 lg21Var2 = (lg21) linkedList.poll();
            if (lg21Var2 != null) {
                lg21Var2.m58929h();
            }
        }
        lg21 lg21VarM77588a = s9p0Var.m77588a();
        if (lg21VarM77588a == null) {
            return null;
        }
        linkedList.add(lg21VarM77588a);
        return lg21VarM77588a;
    }
}
