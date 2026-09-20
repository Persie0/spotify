package p204p;

import com.spotify.messages.PuffinCloudSyncEvent;
import io.reactivex.rxjava3.core.Observable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class u1v0 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f225922a;

    /* JADX INFO: renamed from: b */
    public final Object f225923b;

    public /* synthetic */ u1v0(Object obj, int i) {
        this.f225922a = i;
        this.f225923b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        cl8 cl8Var;
        String property;
        List listM29620k1;
        switch (this.f225922a) {
            case 0:
                c1v0 c1v0Var = (c1v0) ((b1v0) this.f225923b);
                return k0e1.m54988g(((mv31) c1v0Var.f33198b).m62898s(c1v0.f33196d), dau.f47107a).map(new x7q0(c1v0Var, 17)).startWith(Observable.fromCallable(new ic9(c1v0Var, 20))).map(f8r0.f67069f).filter(new bcm0(c1v0Var, 28)).distinctUntilChanged().map(jbr0.f110866f);
            case 1:
                gpv0 gpv0Var = (gpv0) this.f225923b;
                Member memberMo32243l = gpv0Var.mo42980g().getCaller().mo32243l();
                if (memberMo32243l instanceof Method) {
                    if (!Modifier.isStatic(((Method) memberMo32243l).getModifiers())) {
                        throw new IllegalArgumentException(("Only static methods are supported for now: " + memberMo32243l).toString());
                    }
                    cl8Var = new cl8(memberMo32243l, gpv0Var.getIndex(), 19);
                } else {
                    if (!(memberMo32243l instanceof Constructor)) {
                        throw new cvk("Unsupported parameter owner: " + memberMo32243l);
                    }
                    Constructor constructor = (Constructor) memberMo32243l;
                    int length = 0;
                    if (qpv0.f191387a.mo54112b(constructor.getDeclaringClass()).mo29114n() && (property = System.getProperty("java.version")) != null && bm51.m29803n0(property, "1.", false)) {
                        length = -1;
                    } else if (constructor.getDeclaringClass().isEnum()) {
                        length = (constructor.getParameterAnnotations().length - constructor.getParameterTypes().length) + 2;
                    }
                    cl8Var = new cl8(memberMo32243l, gpv0Var.getIndex() + length, 19);
                }
                int i = cl8Var.f39206b;
                Member member = (Member) cl8Var.f39207c;
                if (member instanceof Method) {
                    listM29620k1 = bk5.m29620k1(((Method) member).getParameterAnnotations()[i]);
                } else {
                    listM29620k1 = member instanceof Constructor ? bk5.m29620k1(((Constructor) member).getParameterAnnotations()[i]) : lau.f131415a;
                }
                return j0b1.m52061t(listM29620k1);
            case 2:
                return (bfe0) ((yhy0) this.f225923b).f272995b.invoke(ld70.f132087c);
            case 3:
                return qkf1.m73075C(((to41) this.f225923b).f222170a);
            case 4:
                ((ck2) ((aj2) this.f225923b)).m33062S();
                return w2a1.f247311a;
            case 5:
                bv51 bv51Var = (bv51) this.f225923b;
                return bv51Var.m30588h(vvx.m86514o(bv51Var.f31283b, null, 3));
            case 6:
                ((qre0) this.f225923b).m73616a(PuffinCloudSyncEvent.m14346n().build());
                return w2a1.f247311a;
            case 7:
                return ehw.m39006b(chw.CANNOT_COMPUTE_ERASED_BOUND, ((ae41) this.f225923b).toString());
            default:
                return (List) ((r3b1) this.f225923b).f195471Z.getValue();
        }
    }
}
