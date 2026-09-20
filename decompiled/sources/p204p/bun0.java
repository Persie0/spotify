package p204p;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes6.dex */
public final class bun0 implements Function {

    /* JADX INFO: renamed from: a */
    public final boolean f31168a;

    /* JADX INFO: renamed from: b */
    public final boolean f31169b;

    /* JADX INFO: renamed from: c */
    public final boolean f31170c;

    /* JADX INFO: renamed from: d */
    public final Object f31171d;

    /* JADX INFO: renamed from: e */
    public final Object f31172e;

    /* JADX INFO: renamed from: f */
    public final Object f31173f;

    public bun0(cun0 cun0Var, roa roaVar, ExternalAccessoryDescription externalAccessoryDescription, boolean z, boolean z2, boolean z3) {
        this.f31171d = cun0Var;
        this.f31172e = roaVar;
        this.f31173f = externalAccessoryDescription;
        this.f31168a = z;
        this.f31169b = z2;
        this.f31170c = z3;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return ((cun0) this.f31171d).m33939h((roa) this.f31172e, (ExternalAccessoryDescription) this.f31173f, this.f31168a, this.f31169b, this.f31170c);
    }

    public bun0(Context context, InterfaceC2609yd interfaceC2609yd) {
        this.f31171d = context;
        this.f31172e = interfaceC2609yd;
        boolean z = Build.VERSION.SDK_INT >= 28;
        this.f31173f = (AccessibilityManager) context.getSystemService("accessibility");
        this.f31168a = interfaceC2609yd.mo76359a(7) && z && !interfaceC2609yd.mo76361c();
        boolean z2 = interfaceC2609yd.mo76359a(3) && !interfaceC2609yd.mo76360b();
        this.f31169b = z2;
        this.f31170c = !z2 || interfaceC2609yd.mo76361c();
        interfaceC2609yd.mo76361c();
    }
}
