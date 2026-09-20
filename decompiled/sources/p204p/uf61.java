package p204p;

import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.PuffinCloudSyncEvent;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes10.dex */
public final class uf61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final rbt0 f229699a;

    /* JADX INFO: renamed from: b */
    public final n8t0 f229700b;

    /* JADX INFO: renamed from: c */
    public final nob f229701c;

    /* JADX INFO: renamed from: d */
    public final tpn0 f229702d;

    /* JADX INFO: renamed from: e */
    public final ei1 f229703e;

    /* JADX INFO: renamed from: f */
    public final pul f229704f;

    /* JADX INFO: renamed from: g */
    public final u1v0 f229705g;

    public uf61(rbt0 rbt0Var, n8t0 n8t0Var, nob nobVar, tpn0 tpn0Var, ei1 ei1Var, pul pulVar, u1v0 u1v0Var) {
        this.f229699a = rbt0Var;
        this.f229700b = n8t0Var;
        this.f229701c = nobVar;
        this.f229702d = tpn0Var;
        this.f229703e = ei1Var;
        this.f229704f = pulVar;
        this.f229705g = u1v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (r11 == r5) goto L30;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m82953a(uf61 uf61Var, int i, ibk ibkVar) {
        tf61 tf61Var;
        int iIntValue;
        Object objM75180c;
        n2x0 n2x0Var;
        Object obj;
        if (ibkVar instanceof tf61) {
            tf61Var = (tf61) ibkVar;
            int i2 = tf61Var.f219866e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tf61Var.f219866e = i2 - Integer.MIN_VALUE;
            } else {
                tf61Var = new tf61(uf61Var, ibkVar);
            }
        } else {
            tf61Var = new tf61(uf61Var, ibkVar);
        }
        Object objM96567o = tf61Var.f219864c;
        int i3 = tf61Var.f219866e;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(objM96567o);
            Single map = ((C2048kd) uf61Var.f229702d.f222569b).callSingle("spotify.puffin_esperanto.proto.PuffinService", "LibraryVersion", Empty.m1933n()).map(wjr0.f252030d).map(wsq0.f254709d);
            tf61Var.f219862a = i;
            tf61Var.f219866e = 1;
            objM96567o = zn91.m96567o(map, tf61Var);
            if (objM96567o != yukVar) {
            }
            return yukVar;
        }
        if (i3 == 1) {
            i = tf61Var.f219862a;
            bga.m29073P(objM96567o);
        } else {
            if (i3 == 2) {
                int i4 = tf61Var.f219863b;
                int i5 = tf61Var.f219862a;
                bga.m29073P(objM96567o);
                iIntValue = i4;
                i = i5;
                objM75180c = objM96567o;
                o2x0 o2x0Var = (o2x0) objM75180c;
                n2x0Var = o2x0Var.f161171a;
                if (n2x0Var.f149852O0 || (obj = o2x0Var.f161172b) == null) {
                    Logger.m3966b(edb.m38564m("[Puffin] Could not get cross device filters response ", n2x0Var.f149859c), new Object[0]);
                } else {
                    ei1 ei1Var = uf61Var.f229703e;
                    tf61Var.f219862a = i;
                    tf61Var.f219863b = iIntValue;
                    tf61Var.f219866e = 3;
                    objM96567o = ei1Var.m39054a((lc10) obj, tf61Var);
                }
                return w2a1.f247311a;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = tf61Var.f219862a;
            bga.m29073P(objM96567o);
        }
        if (((a4y0) objM96567o) instanceof z3y0) {
            lv31 lv31VarEdit = uf61Var.f229704f.f181497a.edit();
            lv31VarEdit.m60049b(qul.f192739a, i);
            lv31VarEdit.m60054g();
            ((qre0) uf61Var.f229705g.f225923b).m73616a(PuffinCloudSyncEvent.m14346n().build());
        }
        return w2a1.f247311a;
        iIntValue = ((Number) objM96567o).intValue();
        rbt0 rbt0Var = uf61Var.f229699a;
        tf61Var.f219862a = i;
        tf61Var.f219863b = iIntValue;
        tf61Var.f219866e = 2;
        objM75180c = rbt0Var.m75180c(iIntValue, tf61Var);
        if (objM75180c != yukVar) {
            o2x0 o2x0Var2 = (o2x0) objM75180c;
            n2x0Var = o2x0Var2.f161171a;
            if (n2x0Var.f149852O0) {
            }
            Logger.m3966b(edb.m38564m("[Puffin] Could not get cross device filters response ", n2x0Var.f149859c), new Object[0]);
            return w2a1.f247311a;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.gh00
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fbk fbkVar) {
        sf61 sf61Var;
        if (fbkVar instanceof sf61) {
            sf61Var = (sf61) fbkVar;
            int i = sf61Var.f208482c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sf61Var.f208482c = i - Integer.MIN_VALUE;
            } else {
                sf61Var = new sf61(this, fbkVar);
            }
        } else {
            sf61Var = new sf61(this, fbkVar);
        }
        Object obj = sf61Var.f208480a;
        int i2 = sf61Var.f208482c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        if (this.f229700b.m63854a()) {
            fbk fbkVar2 = null;
            vjz vjzVar = new vjz(new r1a((fiz) this.f229701c.invoke(), new nm8(this, fbkVar2, 11), 8), new yzb0(3, 22, fbkVar2), 2);
            sf61Var.f208482c = 1;
            Object objM89249f = wxf1.m89249f(vjzVar, sf61Var);
            yuk yukVar = yuk.f276404a;
            if (objM89249f == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
    }
}
