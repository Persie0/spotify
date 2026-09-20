package com.google.mlkit.vision.text.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p204p.btq;
import p204p.c8g0;
import p204p.coc1;
import p204p.dkf1;
import p204p.hvf;
import p204p.ktg1;
import p204p.s571;
import p204p.svf;
import p204p.ugx;
import p204p.uic1;
import p204p.xjf1;
import p204p.xrg1;

/* JADX INFO: loaded from: classes.dex */
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        hvf hvfVarM79442a = svf.m79442a(ktg1.class);
        hvfVarM79442a.m48826a(btq.m30467a(c8g0.class));
        hvfVarM79442a.f95702f = new uic1(3);
        svf svfVarM48827b = hvfVarM79442a.m48827b();
        hvf hvfVarM79442a2 = svf.m79442a(xrg1.class);
        hvfVarM79442a2.m48826a(btq.m30467a(ktg1.class));
        hvfVarM79442a2.m48826a(btq.m30467a(ugx.class));
        hvfVarM79442a2.f95702f = new coc1();
        Object[] objArr = {svfVarM48827b, hvfVarM79442a2.m48827b()};
        for (int i = 0; i < 2; i++) {
            xjf1 xjf1Var = dkf1.f49968g;
            if (objArr[i] == null) {
                throw new NullPointerException(s571.m77246e(i, "at index "));
            }
        }
        return dkf1.m36305q(2, objArr);
    }
}
