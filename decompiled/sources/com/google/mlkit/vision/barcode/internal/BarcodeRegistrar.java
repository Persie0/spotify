package com.google.mlkit.vision.barcode.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p204p.btq;
import p204p.c8g0;
import p204p.crc1;
import p204p.gqf1;
import p204p.hvf;
import p204p.jsc1;
import p204p.pbg1;
import p204p.svf;
import p204p.ugx;
import p204p.v4g1;

/* JADX INFO: loaded from: classes4.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        hvf hvfVarM79442a = svf.m79442a(pbg1.class);
        hvfVarM79442a.m48826a(btq.m30467a(c8g0.class));
        hvfVarM79442a.f95702f = new crc1();
        svf svfVarM48827b = hvfVarM79442a.m48827b();
        hvf hvfVarM79442a2 = svf.m79442a(v4g1.class);
        hvfVarM79442a2.m48826a(btq.m30467a(pbg1.class));
        hvfVarM79442a2.m48826a(btq.m30467a(ugx.class));
        hvfVarM79442a2.m48826a(btq.m30467a(c8g0.class));
        hvfVarM79442a2.f95702f = new jsc1();
        return gqf1.m45434i(svfVarM48827b, hvfVarM79442a2.m48827b());
    }
}
