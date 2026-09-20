package p204p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes2.dex */
public final class ums {

    /* JADX INFO: renamed from: a */
    public final b9v0 f231948a;

    /* JADX INFO: renamed from: b */
    public final nud1 f231949b;

    public ums(b9v0 b9v0Var, nud1 nud1Var) {
        this.f231948a = b9v0Var;
        this.f231949b = nud1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r5.f231948a.m28542e(r6, r7, r0) == r4) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83490a(int i, WidgetState widgetState, ibk ibkVar) {
        tms tmsVar;
        if (ibkVar instanceof tms) {
            tmsVar = (tms) ibkVar;
            int i2 = tmsVar.f221776e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tmsVar.f221776e = i2 - Integer.MIN_VALUE;
            } else {
                tmsVar = new tms(this, ibkVar);
            }
        } else {
            tmsVar = new tms(this, ibkVar);
        }
        Object obj = tmsVar.f221774c;
        int i3 = tmsVar.f221776e;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(obj);
            tmsVar.f221773b = widgetState;
            tmsVar.f221772a = i;
            tmsVar.f221776e = 1;
            if (this.f231949b.m65688a(i, widgetState, tmsVar) != yukVar) {
            }
            return yukVar;
        }
        if (i3 == 1) {
            i = tmsVar.f221772a;
            widgetState = tmsVar.f221773b;
            bga.m29073P(obj);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
        tmsVar.f221773b = null;
        tmsVar.f221772a = i;
        tmsVar.f221776e = 2;
    }
}
