package p204p;

import android.view.ViewGroup;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: p.et */
/* JADX INFO: loaded from: classes4.dex */
public final class C1826et implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62533a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f62534b;

    public /* synthetic */ C1826et(int i, ViewGroup viewGroup) {
        this.f62533a = i;
        this.f62534b = viewGroup;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(o6q0 o6q0Var, fbk fbkVar) {
        C1789dt c1789dt;
        gb90 gb90Var;
        aut0 aut0Var;
        switch (this.f62533a) {
            case 0:
                if (fbkVar instanceof C1789dt) {
                    c1789dt = (C1789dt) fbkVar;
                    int i = c1789dt.f52680c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1789dt.f52680c = i - Integer.MIN_VALUE;
                    } else {
                        c1789dt = new C1789dt(this, fbkVar);
                    }
                } else {
                    c1789dt = new C1789dt(this, fbkVar);
                }
                Object obj = c1789dt.f52678a;
                int i2 = c1789dt.f52680c;
                ViewGroup viewGroup = this.f62534b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    C1753ct c1753ct = new C1753ct(viewGroup, null, 0);
                    c1789dt.f52680c = 1;
                    Object objM95926g = zdg1.m95926g(o6q0Var, c1753ct, c1789dt);
                    yuk yukVar = yuk.f276404a;
                    if (objM95926g == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                viewGroup.requestDisallowInterceptTouchEvent(false);
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof gb90) {
                    gb90Var = (gb90) fbkVar;
                    int i3 = gb90Var.f78241c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gb90Var.f78241c = i3 - Integer.MIN_VALUE;
                    } else {
                        gb90Var = new gb90(this, fbkVar);
                    }
                } else {
                    gb90Var = new gb90(this, fbkVar);
                }
                Object obj2 = gb90Var.f78239a;
                int i4 = gb90Var.f78241c;
                ViewGroup viewGroup2 = this.f62534b;
                if (i4 == 0) {
                    bga.m29073P(obj2);
                    C1753ct c1753ct2 = new C1753ct(viewGroup2, null, 1);
                    gb90Var.f78241c = 1;
                    Object objM95926g2 = zdg1.m95926g(o6q0Var, c1753ct2, gb90Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM95926g2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                viewGroup2.requestDisallowInterceptTouchEvent(false);
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof aut0) {
                    aut0Var = (aut0) fbkVar;
                    int i5 = aut0Var.f20027c;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        aut0Var.f20027c = i5 - Integer.MIN_VALUE;
                    } else {
                        aut0Var = new aut0(this, fbkVar);
                    }
                } else {
                    aut0Var = new aut0(this, fbkVar);
                }
                Object obj3 = aut0Var.f20025a;
                int i6 = aut0Var.f20027c;
                ViewGroup viewGroup3 = this.f62534b;
                if (i6 == 0) {
                    bga.m29073P(obj3);
                    C1753ct c1753ct3 = new C1753ct(viewGroup3, null, 2);
                    aut0Var.f20027c = 1;
                    Object objM95926g3 = zdg1.m95926g(o6q0Var, c1753ct3, aut0Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objM95926g3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                viewGroup3.requestDisallowInterceptTouchEvent(false);
                return w2a1.f247311a;
        }
    }
}
