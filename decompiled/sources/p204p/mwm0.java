package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mwm0 extends exh0 implements dp70 {

    /* JADX INFO: renamed from: M0 */
    public float f147818M0;

    /* JADX INFO: renamed from: N0 */
    public vum0 f147819N0;

    /* JADX INFO: renamed from: O0 */
    public rv41 f147820O0;

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        vum0 vum0Var = this.f147819N0;
        int iRound = (vum0Var == null || ((Number) vum0Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) vum0Var.getValue()).floatValue() * this.f147818M0);
        rv41 rv41Var = this.f147820O0;
        int iRound2 = (rv41Var == null || ((Number) rv41Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) rv41Var.getValue()).floatValue() * this.f147818M0);
        int iM28432k = iRound != Integer.MAX_VALUE ? iRound : b8j.m28432k(j);
        int iM28431j = iRound2 != Integer.MAX_VALUE ? iRound2 : b8j.m28431j(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = b8j.m28430i(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = b8j.m28429h(j);
        }
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(e8j.m38110a(iM28432k, iRound, iM28431j, iRound2));
        return o6d0Var.mo44714T(t5o0VarMo39619B.f217322a, t5o0VarMo39619B.f217323b, nau.f152117a, new C2484v6(t5o0VarMo39619B, 11));
    }
}
