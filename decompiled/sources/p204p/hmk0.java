package p204p;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes11.dex */
public final class hmk0 implements rr60 {

    /* JADX INFO: renamed from: a */
    public final Object f92994a;

    /* JADX INFO: renamed from: b */
    public final List f92995b;

    /* JADX INFO: renamed from: c */
    public final Object f92996c;

    public hmk0(String str, Object obj) {
        this.f92994a = obj;
        this.f92995b = lau.f131415a;
        this.f92996c = q3d0.m72078I(2, new C2570xf(25, str, this));
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 descriptor = getDescriptor();
        frh frhVarMo29814b = froVar.mo29814b(descriptor);
        frhVarMo29814b.getClass();
        int iMo29816p = frhVarMo29814b.mo29816p(getDescriptor());
        if (iMo29816p != -1) {
            throw new SerializationException(s571.m77246e(iMo29816p, "Unexpected index "));
        }
        frhVarMo29814b.mo29813a(descriptor);
        return this.f92994a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return (ktz0) this.f92996c.getValue();
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35820b(getDescriptor()).mo44937a(getDescriptor());
    }

    public hmk0(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        this.f92995b = Arrays.asList(annotationArr);
    }
}
