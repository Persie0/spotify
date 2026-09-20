package p204p;

import androidx.glance.appwidget.protobuf.AbstractC0055a;
import androidx.glance.appwidget.protobuf.AbstractC0059e;
import androidx.glance.appwidget.protobuf.AbstractC0063i;
import androidx.glance.appwidget.protobuf.AbstractC0064j;
import androidx.glance.appwidget.protobuf.C0061g;
import androidx.glance.appwidget.protobuf.C0062h;
import androidx.glance.appwidget.protobuf.C0066l;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b3t0 {

    /* JADX INFO: renamed from: c */
    public static final b3t0 f23129c = new b3t0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f23131b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final ihj0 f23130a = new ihj0(1);

    /* JADX INFO: renamed from: a */
    public static b3t0 m28052a() {
        return f23129c;
    }

    /* JADX INFO: renamed from: b */
    public final jgy0 m28053b(Class cls) {
        jgy0 jgy0VarM682w;
        Class cls2;
        ce50.m32495a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f23131b;
        jgy0 jgy0Var = (jgy0) concurrentHashMap.get(cls);
        if (jgy0Var != null) {
            return jgy0Var;
        }
        ihj0 ihj0Var = this.f23130a;
        ihj0Var.getClass();
        Class cls3 = AbstractC0063i.f933a;
        if (!AbstractC0059e.class.isAssignableFrom(cls) && (cls2 = AbstractC0063i.f933a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        bbu0 bbu0VarMo39566a = ((wbc0) ihj0Var.f102306b).mo39566a(cls);
        int i = bbu0VarMo39566a.f25661d;
        AbstractC0055a abstractC0055a = bbu0VarMo39566a.f25658a;
        if ((i & 2) == 2) {
            if (AbstractC0059e.class.isAssignableFrom(cls)) {
                jgy0VarM682w = new C0062h(AbstractC0063i.f935c, iux.f106047a, abstractC0055a);
            } else {
                AbstractC0064j abstractC0064j = AbstractC0063i.f934b;
                fux fuxVar = iux.f106048b;
                if (fuxVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                jgy0VarM682w = new C0062h(abstractC0064j, fuxVar, abstractC0055a);
            }
        } else if (AbstractC0059e.class.isAssignableFrom(cls)) {
            fux fuxVar2 = null;
            ajj0 ajj0Var = ejj0.f60237b;
            lv80 lv80Var = nv80.f158840b;
            C0066l c0066l = AbstractC0063i.f935c;
            if (edb.m38547C(bbu0VarMo39566a.m28647a()) != 1) {
                fuxVar2 = iux.f106047a;
            }
            fux fuxVar3 = fuxVar2;
            mhc0 mhc0Var = qhc0.f188709b;
            if (!(bbu0VarMo39566a instanceof bbu0)) {
                int[] iArr = C0061g.f915n;
                bbu0VarMo39566a.getClass();
                throw new ClassCastException();
            }
            jgy0VarM682w = C0061g.m682w(bbu0VarMo39566a, ajj0Var, lv80Var, c0066l, fuxVar3, mhc0Var);
        } else {
            fux fuxVar4 = null;
            ajj0 ajj0Var2 = ejj0.f60236a;
            lv80 lv80Var2 = nv80.f158839a;
            AbstractC0064j abstractC0064j2 = AbstractC0063i.f934b;
            if (edb.m38547C(bbu0VarMo39566a.m28647a()) != 1 && (fuxVar4 = iux.f106048b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            fux fuxVar5 = fuxVar4;
            mhc0 mhc0Var2 = qhc0.f188708a;
            if (!(bbu0VarMo39566a instanceof bbu0)) {
                int[] iArr2 = C0061g.f915n;
                bbu0VarMo39566a.getClass();
                throw new ClassCastException();
            }
            jgy0VarM682w = C0061g.m682w(bbu0VarMo39566a, ajj0Var2, lv80Var2, abstractC0064j2, fuxVar5, mhc0Var2);
        }
        jgy0 jgy0Var2 = (jgy0) concurrentHashMap.putIfAbsent(cls, jgy0VarM682w);
        return jgy0Var2 != null ? jgy0Var2 : jgy0VarM682w;
    }

    /* JADX INFO: renamed from: c */
    public final jgy0 m28054c(Object obj) {
        return m28053b(obj.getClass());
    }
}
