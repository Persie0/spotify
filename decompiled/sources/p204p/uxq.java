package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class uxq {

    /* JADX INFO: renamed from: a */
    public final g50 f235026a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f235027b;

    public uxq(g50 g50Var, int i) {
        this.f235027b = i;
        this.f235026a = g50Var;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0291 A[ADDED_TO_REGION, LOOP:1: B:135:0x0291->B:147:0x02c2, LOOP_START, PHI: r8
      0x0291: PHI (r8v2 p.oqo) = (r8v0 p.oqo), (r8v3 p.oqo) binds: [B:133:0x028e, B:147:0x02c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x0293  */
    /* JADX WARN: Code duplicated, block: B:138:0x0296  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c2 A[LOOP:1: B:135:0x0291->B:147:0x02c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x029a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [p.oqo] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.oqo, p.tqo] */
    /* JADX WARN: Type inference failed for: r7v6, types: [p.oqo] */
    /* JADX WARN: Type inference failed for: r7v7, types: [p.oqo] */
    /* JADX WARN: Type inference failed for: r7v9, types: [p.oqo] */
    /* JADX INFO: renamed from: a */
    public final boolean m84184a(rzu0 rzu0Var, tqo tqoVar, oqo oqoVar) {
        oqo oqoVarM76670h;
        nfe nfeVar;
        switch (this.f235027b) {
            case 0:
                if (oqoVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (rxq.m76679q(tqoVar) && rxq.m76667e(oqoVar) != unq0.f232223Q0) {
                    return vxq.m86673d(tqoVar, oqoVar);
                }
                if (tqoVar instanceof k8j) {
                    ((k8j) tqoVar).mo27379o();
                }
                while (tqoVar != 0) {
                    tqoVar = tqoVar.mo27379o();
                    if (((tqoVar instanceof nfe) && !rxq.m76673k(tqoVar)) || (tqoVar instanceof m3m0)) {
                        if (tqoVar != 0) {
                            while (oqoVar != null) {
                                if (tqoVar != oqoVar) {
                                    if (oqoVar instanceof m3m0) {
                                        oqoVar = oqoVar.mo27379o();
                                    } else if ((tqoVar instanceof m3m0) || !((n3m0) ((m3m0) tqoVar)).f150085f.equals(((n3m0) ((m3m0) oqoVar)).f150085f) || !rxq.m76665c(oqoVar).equals(rxq.m76665c(tqoVar))) {
                                    }
                                }
                                return true;
                            }
                        }
                        return false;
                    }
                }
                if (tqoVar != 0) {
                    while (oqoVar != null) {
                        if (tqoVar != oqoVar) {
                            if (oqoVar instanceof m3m0) {
                                oqoVar = oqoVar.mo27379o();
                            } else if (tqoVar instanceof m3m0) {
                            }
                        }
                        return true;
                    }
                }
                return false;
            case 1:
                if (oqoVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (vxq.f245806a.m84184a(rzu0Var, tqoVar, oqoVar)) {
                    if (rzu0Var == vxq.f245818m) {
                        return true;
                    }
                    if (rzu0Var != vxq.f245817l && (oqoVarM76670h = rxq.m76670h(tqoVar, nfe.class, true)) != null && (rzu0Var instanceof kg40)) {
                        return ((kg40) rzu0Var).f122298a.mo27377a().equals(oqoVarM76670h.mo27377a());
                    }
                }
                return false;
            case 2:
                if (oqoVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                nfe nfeVar2 = (nfe) rxq.m76670h(tqoVar, nfe.class, true);
                nfe nfeVar3 = (nfe) rxq.m76670h(oqoVar, nfe.class, false);
                if (nfeVar3 != null) {
                    if (nfeVar2 != null && rxq.m76673k(nfeVar2) && (nfeVar = (nfe) rxq.m76670h(nfeVar2, nfe.class, true)) != null && rxq.m76678p(nfeVar3.mo27380q(), nfeVar.mo27377a())) {
                        return true;
                    }
                    ?? M76680r = tqoVar instanceof eab ? rxq.m76680r((eab) tqoVar) : tqoVar;
                    nfe nfeVar4 = (nfe) rxq.m76670h(M76680r, nfe.class, true);
                    if (nfeVar4 != null) {
                        if (rxq.m76678p(nfeVar3.mo27380q(), nfeVar4.mo27377a()) && rzu0Var != vxq.f245819n) {
                            if (!(M76680r instanceof eab) || (M76680r instanceof k8j) || rzu0Var == vxq.f245818m) {
                                return true;
                            }
                            if (rzu0Var != vxq.f245817l && rzu0Var != null) {
                                gd70 type = rzu0Var.getType();
                                if (rxq.m76678p(type, nfeVar3)) {
                                    return true;
                                }
                                type.mo35108F0();
                            }
                        }
                        return m84184a(rzu0Var, tqoVar, nfeVar3.mo27379o());
                    }
                }
                return false;
            case 3:
                if (oqoVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!rxq.m76665c(oqoVar).mo53209U(rxq.m76665c(tqoVar))) {
                    return false;
                }
                vxq.f245820o.getClass();
                return true;
            case 4:
                if (oqoVar != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 5:
                if (oqoVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                if (oqoVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
                if (oqoVar != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            case 8:
                if (oqoVar != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
            case 9:
                if (oqoVar != null) {
                    return kd60.m56164c(tqoVar, oqoVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 10:
                if (oqoVar != null) {
                    return kd60.m56163b(rzu0Var, tqoVar, oqoVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (oqoVar != null) {
                    return kd60.m56163b(rzu0Var, tqoVar, oqoVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    public final String toString() {
        return this.f235026a.mo43567d();
    }
}
