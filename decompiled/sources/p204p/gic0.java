package p204p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class gic0 extends j400 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final jic0 f80125a;

    /* JADX INFO: renamed from: b */
    public final jic0 f80126b;

    /* JADX INFO: renamed from: c */
    public final bdw f80127c;

    /* JADX INFO: renamed from: d */
    public final int f80128d;

    /* JADX INFO: renamed from: e */
    public transient AbstractMap f80129e;

    public gic0(jic0 jic0Var, jic0 jic0Var2, bdw bdwVar, int i, ajc0 ajc0Var) {
        this.f80125a = jic0Var;
        this.f80126b = jic0Var2;
        this.f80127c = bdwVar;
        this.f80128d = i;
        this.f80129e = ajc0Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        rz10 rz10Var = new rz10();
        c95.m31843i(i >= 0);
        rz10Var.f204024c = i;
        jic0 jic0Var = (jic0) rz10Var.f204026e;
        c95.m31857w(jic0Var == null, "Key strength was already set to %s", jic0Var);
        jic0 jic0Var2 = this.f80125a;
        jic0Var2.getClass();
        rz10Var.f204026e = jic0Var2;
        hic0 hic0Var = jic0.f112719a;
        if (jic0Var2 != hic0Var) {
            rz10Var.f204023b = true;
        }
        jic0 jic0Var3 = (jic0) rz10Var.f204027f;
        c95.m31857w(jic0Var3 == null, "Value strength was already set to %s", jic0Var3);
        jic0 jic0Var4 = this.f80126b;
        jic0Var4.getClass();
        rz10Var.f204027f = jic0Var4;
        if (jic0Var4 != hic0Var) {
            rz10Var.f204023b = true;
        }
        bdw bdwVar = (bdw) rz10Var.f204028g;
        c95.m31857w(bdwVar == null, "key equivalence was already set to %s", bdwVar);
        bdw bdwVar2 = this.f80127c;
        bdwVar2.getClass();
        rz10Var.f204028g = bdwVar2;
        rz10Var.f204023b = true;
        int i2 = rz10Var.f204025d;
        c95.m31854t("concurrency level was already set to %s", i2, i2 == -1);
        int i3 = this.f80128d;
        c95.m31843i(i3 > 0);
        rz10Var.f204025d = i3;
        this.f80129e = (AbstractMap) rz10Var.m76754d();
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                return;
            } else {
                this.f80129e.put(object, objectInputStream.readObject());
            }
        }
    }

    private Object readResolve() {
        return this.f80129e;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f80129e.size());
        for (Map.Entry entry : this.f80129e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }

    @Override // com.google.common.collect.ForwardingMap, p204p.q400
    public final Object delegate() {
        return this.f80129e;
    }

    @Override // com.google.common.collect.ForwardingMap, p204p.q400
    public final Map delegate() {
        return this.f80129e;
    }
}
