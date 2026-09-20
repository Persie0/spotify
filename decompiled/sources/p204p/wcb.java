package p204p;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class wcb implements veb {

    /* JADX INFO: renamed from: b */
    public final ucb f249987b;

    /* JADX INFO: renamed from: c */
    public final htz0 f249988c;

    /* JADX INFO: renamed from: d */
    public final Object f249989d = new Object();

    /* JADX INFO: renamed from: e */
    public final peb f249990e;

    /* JADX INFO: renamed from: f */
    public final fs9 f249991f;

    /* JADX INFO: renamed from: g */
    public final rxz0 f249992g;

    /* JADX INFO: renamed from: h */
    public final mpz f249993h;

    /* JADX INFO: renamed from: i */
    public final sze1 f249994i;

    /* JADX INFO: renamed from: j */
    public final ey9 f249995j;

    /* JADX INFO: renamed from: k */
    public final zmn0 f249996k;

    /* JADX INFO: renamed from: l */
    public final fp10 f249997l;

    /* JADX INFO: renamed from: m */
    public final pcb f249998m;

    /* JADX INFO: renamed from: n */
    public final zi5 f249999n;

    /* JADX INFO: renamed from: o */
    public final i391 f250000o;

    /* JADX INFO: renamed from: p */
    public int f250001p;

    /* JADX INFO: renamed from: q */
    public volatile boolean f250002q;

    /* JADX INFO: renamed from: r */
    public volatile int f250003r;

    /* JADX INFO: renamed from: s */
    public final ckx0 f250004s;

    /* JADX INFO: renamed from: t */
    public final ku7 f250005t;

    /* JADX INFO: renamed from: u */
    public final AtomicLong f250006u;

    /* JADX INFO: renamed from: v */
    public int f250007v;

    /* JADX INFO: renamed from: w */
    public long f250008w;

    /* JADX INFO: renamed from: x */
    public final tcb f250009x;

    public wcb(peb pebVar, zb20 zb20Var, htz0 htz0Var, fs9 fs9Var, rwt0 rwt0Var) {
        rxz0 rxz0Var = new rxz0();
        this.f249992g = rxz0Var;
        this.f250001p = 0;
        this.f250002q = false;
        this.f250003r = 2;
        this.f250006u = new AtomicLong(0L);
        this.f250007v = 1;
        this.f250008w = 0L;
        tcb tcbVar = new tcb();
        tcbVar.f219059b = new HashSet();
        tcbVar.f219060c = new ArrayMap();
        this.f250009x = tcbVar;
        this.f249990e = pebVar;
        this.f249991f = fs9Var;
        this.f249988c = htz0Var;
        this.f250000o = new i391(htz0Var);
        ucb ucbVar = new ucb(htz0Var);
        this.f249987b = ucbVar;
        rxz0Var.f193768b.f266335a = this.f250007v;
        rxz0Var.f193768b.m92220h(new svb(ucbVar));
        rxz0Var.f193768b.m92220h(tcbVar);
        this.f249996k = new zmn0(this, htz0Var);
        this.f249993h = new mpz(this, htz0Var);
        this.f249994i = new sze1(this, pebVar, htz0Var);
        this.f249995j = new ey9(this, pebVar, htz0Var);
        this.f249997l = new fp10(pebVar);
        this.f250004s = new ckx0(rwt0Var);
        this.f250005t = new ku7(rwt0Var, 0);
        this.f249998m = new pcb(this, htz0Var);
        this.f249999n = new zi5(this, pebVar, rwt0Var, htz0Var, zb20Var);
    }

    /* JADX INFO: renamed from: k */
    public static int m87715k(peb pebVar, int i) {
        int[] iArr = (int[]) pebVar.m69715a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m87716l(iArr, i)) {
            return i;
        }
        return m87716l(iArr, 1) ? 1 : 0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m87716l(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.veb
    /* JADX INFO: renamed from: a */
    public final Rect mo78862a() {
        Rect rect = (Rect) this.f249990e.m69715a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // p204p.veb
    /* JADX INFO: renamed from: b */
    public final void mo78863b(int i) {
        int i2;
        synchronized (this.f249989d) {
            i2 = this.f250001p;
        }
        if (!(i2 > 0)) {
            vie1.m85617F("Camera2CameraControlImp");
            return;
        }
        this.f250003r = i;
        vie1.m85624f("Camera2CameraControlImp");
        fp10 fp10Var = this.f249997l;
        if (this.f250003r != 1) {
            int i3 = this.f250003r;
        }
        fp10Var.getClass();
        x4w0.m89920K(n5h1.m63736l(new io9(this, 4)));
    }

    @Override // p204p.veb
    /* JADX INFO: renamed from: c */
    public final phi mo78864c() {
        sdb sdbVar;
        pcb pcbVar = this.f249998m;
        synchronized (pcbVar.f176006f) {
            gl8 gl8Var = (gl8) pcbVar.f176007g;
            gl8Var.getClass();
            sdbVar = new sdb(jvl0.m54384j((lpi0) gl8Var.f81018b), 11);
        }
        return sdbVar;
    }

    @Override // p204p.veb
    /* JADX INFO: renamed from: d */
    public final void mo78865d(phi phiVar) {
        pcb pcbVar = this.f249998m;
        gd8 gd8VarM25087c = a99.m25084j(phiVar).m25087c();
        synchronized (pcbVar.f176006f) {
            gl8 gl8Var = (gl8) pcbVar.f176007g;
            gl8Var.getClass();
            nhi nhiVar = nhi.f154013c;
            for (sy7 sy7Var : gd8VarM25087c.mo39827b()) {
                ((lpi0) gl8Var.f81018b).m59674w(sy7Var, nhiVar, gd8VarM25087c.mo39828c(sy7Var));
            }
        }
        x4w0.m89920K(n5h1.m63736l(new ncb(pcbVar, 0))).mo28322a(new RunnableC2034k(8), e95.m38202g());
    }

    @Override // p204p.veb
    /* JADX INFO: renamed from: e */
    public final void mo78866e(rxz0 rxz0Var) throws Exception {
        boolean zIsEmpty;
        HashMap map;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        fp10 fp10Var = this.f249997l;
        g7d1 g7d1Var = (g7d1) fp10Var.f71683a;
        while (true) {
            synchronized (g7d1Var.f77248c) {
                zIsEmpty = ((ArrayDeque) g7d1Var.f77247b).isEmpty();
            }
            if (zIsEmpty) {
                break;
            } else {
                ((ua40) g7d1Var.m43806e()).close();
            }
        }
        ue40 ue40Var = (ue40) fp10Var.f71690h;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (ue40Var != null) {
            xvb xvbVar = (xvb) fp10Var.f71688f;
            if (xvbVar != null) {
                x4w0.m89920K(ue40Var.f144309e).mo28322a(new bwb(xvbVar, 2), e95.m38211p());
                fp10Var.f71688f = null;
            }
            ue40Var.mo61983a();
            fp10Var.f71690h = null;
        }
        ImageWriter imageWriter = (ImageWriter) fp10Var.f71691i;
        if (imageWriter != null) {
            imageWriter.close();
            fp10Var.f71691i = null;
        }
        boolean z = true;
        if (fp10Var.f71684b) {
            rxz0Var.f193768b.f266335a = 1;
            return;
        }
        if (fp10Var.f71686d) {
            rxz0Var.f193768b.f266335a = 1;
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) ((peb) fp10Var.f71687e).m69715a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            e.getMessage();
            vie1.m85626h("ZslControlImpl");
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new utf(z, 0));
                    map.put(Integer.valueOf(i), inputSizes[0]);
                }
            }
        }
        if (fp10Var.f71685c && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) ((peb) fp10Var.f71687e).m69715a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i2 : validOutputFormatsForInput) {
                if (i2 == 256) {
                    Size size = (Size) map.get(34);
                    c7f0 c7f0Var = new c7f0(size.getWidth(), size.getHeight(), 34, 9);
                    fp10Var.f71689g = c7f0Var.f34881b;
                    fp10Var.f71688f = new xvb(c7f0Var);
                    c7f0Var.mo26030g(new zga1(fp10Var, 29), e95.m38209n());
                    ue40 ue40Var2 = new ue40(((xvb) fp10Var.f71688f).getSurface(), new Size(((xvb) fp10Var.f71688f).mo26027d(), ((xvb) fp10Var.f71688f).mo26026b()), 34);
                    fp10Var.f71690h = ue40Var2;
                    xvb xvbVar2 = (xvb) fp10Var.f71688f;
                    u790 u790VarM89920K = x4w0.m89920K(ue40Var2.f144309e);
                    Objects.requireNonNull(xvbVar2);
                    u790VarM89920K.mo28322a(new bwb(xvbVar2, 2), e95.m38211p());
                    rxz0Var.m76685b((ue40) fp10Var.f71690h, cns.f40076d, -1);
                    cwb cwbVar = (cwb) fp10Var.f71689g;
                    rxz0Var.f193768b.m92220h(cwbVar);
                    ArrayList arrayList = rxz0Var.f193771e;
                    if (!arrayList.contains(cwbVar)) {
                        arrayList.add(cwbVar);
                    }
                    meb mebVar = new meb(fp10Var, 2);
                    ArrayList arrayList2 = rxz0Var.f193770d;
                    if (!arrayList2.contains(mebVar)) {
                        arrayList2.add(mebVar);
                    }
                    rxz0Var.f193773g = new InputConfiguration(((xvb) fp10Var.f71688f).mo26027d(), ((xvb) fp10Var.f71688f).mo26026b(), ((xvb) fp10Var.f71688f).mo26028e());
                    return;
                }
            }
        }
        rxz0Var.f193768b.f266335a = 1;
    }

    @Override // p204p.veb
    /* JADX INFO: renamed from: g */
    public final void mo78868g() {
        pcb pcbVar = this.f249998m;
        synchronized (pcbVar.f176006f) {
            pcbVar.f176007g = new gl8();
        }
        x4w0.m89920K(n5h1.m63736l(new ncb(pcbVar, 1))).mo28322a(new RunnableC2034k(8), e95.m38202g());
    }

    /* JADX INFO: renamed from: h */
    public final void m87717h(vcb vcbVar) {
        ((HashSet) this.f249987b.f228988b).add(vcbVar);
    }

    /* JADX INFO: renamed from: i */
    public final void m87718i() {
        synchronized (this.f249989d) {
            try {
                int i = this.f250001p;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f250001p = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x011d A[Catch: all -> 0x0166, LOOP:0: B:62:0x0117->B:64:0x011d, LOOP_END, TryCatch #0 {, blocks: (B:61:0x0105, B:62:0x0117, B:64:0x011d, B:65:0x012f), top: B:74:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0035  */
    /* JADX INFO: renamed from: j */
    public final vxz0 m87719j() {
        int[] iArr;
        zmn0 zmn0Var;
        pcb pcbVar;
        lpi0 lpi0Var;
        nhi nhiVar;
        rxz0 rxz0Var = this.f249992g;
        rxz0Var.f193768b.f266335a = this.f250007v;
        gl8 gl8Var = new gl8();
        int i = 1;
        gl8Var.m45101p(CaptureRequest.CONTROL_MODE, 1);
        mpz mpzVar = this.f249993h;
        mpzVar.getClass();
        int i2 = 3;
        int i3 = mpzVar.f146118c != 3 ? 4 : 3;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        int[] iArr2 = (int[]) mpzVar.f146116a.f249990e.m69715a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 == null) {
            i3 = 0;
        } else if (!m87716l(iArr2, i3)) {
            i3 = 4;
            if (!m87716l(iArr2, 4)) {
                i3 = 1;
                if (!m87716l(iArr2, 1)) {
                    i3 = 0;
                }
            }
        }
        gl8Var.m45101p(key, Integer.valueOf(i3));
        MeteringRectangle[] meteringRectangleArr = mpzVar.f146119d;
        if (meteringRectangleArr.length != 0) {
            gl8Var.m45101p(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = mpzVar.f146120e;
        if (meteringRectangleArr2.length != 0) {
            gl8Var.m45101p(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = mpzVar.f146121f;
        if (meteringRectangleArr3.length != 0) {
            gl8Var.m45101p(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
        Range range = (Range) this.f250004s.f39112b;
        if (range != null) {
            gl8Var.m45101p(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
        this.f249994i.f215553d.mo31912k(gl8Var);
        int i4 = this.f249993h.f146122g ? 5 : 1;
        if (!this.f250002q) {
            int i5 = this.f250003r;
            if (i5 == 0) {
                ku7 ku7Var = this.f250005t;
                if (ku7Var.f126475a || ku7Var.f126476b) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
            } else if (i5 != 1) {
                if (i5 == 2) {
                    i2 = 1;
                }
            }
            gl8Var.m45101p(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m87715k(this.f249990e, i2)));
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
            iArr = (int[]) this.f249990e.m69715a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null || (!m87716l(iArr, 1) && !m87716l(iArr, 1))) {
                i = 0;
            }
            gl8Var.m45101p(key2, Integer.valueOf(i));
            zmn0Var = this.f249996k;
            zmn0Var.getClass();
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            synchronized (((fox) zmn0Var.f284323c).f71637a) {
            }
            gl8Var.m45101p(key3, 0);
            pcbVar = this.f249998m;
            synchronized (pcbVar.f176006f) {
                lpi0Var = (lpi0) ((gl8) pcbVar.f176007g).f81018b;
                nhiVar = nhi.f154011a;
                for (sy7 sy7Var : lpi0Var.mo39827b()) {
                    ((lpi0) gl8Var.f81018b).m59674w(sy7Var, nhiVar, lpi0Var.mo39828c(sy7Var));
                }
            }
            sdb sdbVar = new sdb(jvl0.m54384j((lpi0) gl8Var.f81018b), 11);
            xvb xvbVar = rxz0Var.f193768b;
            xvbVar.getClass();
            xvbVar.f266338d = lpi0.m59672u(sdbVar);
            ((nqi0) this.f249992g.f193768b.f266340f).f72778a.put("CameraControlSessionUpdateId", Long.valueOf(this.f250008w));
            return this.f249992g.m76686c();
        }
        gl8Var.m45101p(CaptureRequest.FLASH_MODE, 2);
        i2 = i4;
        gl8Var.m45101p(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m87715k(this.f249990e, i2)));
        CaptureRequest.Key key4 = CaptureRequest.CONTROL_AWB_MODE;
        iArr = (int[]) this.f249990e.m69715a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
            i = 0;
        } else {
            i = 0;
        }
        gl8Var.m45101p(key4, Integer.valueOf(i));
        zmn0Var = this.f249996k;
        zmn0Var.getClass();
        CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        synchronized (((fox) zmn0Var.f284323c).f71637a) {
            gl8Var.m45101p(key5, 0);
            pcbVar = this.f249998m;
            synchronized (pcbVar.f176006f) {
                lpi0Var = (lpi0) ((gl8) pcbVar.f176007g).f81018b;
                nhiVar = nhi.f154011a;
                while (r5.hasNext()) {
                    ((lpi0) gl8Var.f81018b).m59674w(sy7Var, nhiVar, lpi0Var.mo39828c(sy7Var));
                }
                sdb sdbVar2 = new sdb(jvl0.m54384j((lpi0) gl8Var.f81018b), 11);
                xvb xvbVar2 = rxz0Var.f193768b;
                xvbVar2.getClass();
                xvbVar2.f266338d = lpi0.m59672u(sdbVar2);
                ((nqi0) this.f249992g.f193768b.f266340f).f72778a.put("CameraControlSessionUpdateId", Long.valueOf(this.f250008w));
                return this.f249992g.m76686c();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m87720m(boolean z) {
        c18 c18Var;
        vie1.m85624f("Camera2CameraControlImp");
        mpz mpzVar = this.f249993h;
        if (z != mpzVar.f146117b) {
            mpzVar.f146117b = z;
            if (!mpzVar.f146117b) {
                wcb wcbVar = mpzVar.f146116a;
                ((HashSet) wcbVar.f249987b.f228988b).remove(null);
                ((HashSet) wcbVar.f249987b.f228988b).remove(null);
                if (mpzVar.f146119d.length > 0 && mpzVar.f146117b) {
                    xvb xvbVar = new xvb(0);
                    xvbVar.f266336b = true;
                    xvbVar.f266335a = mpzVar.f146118c;
                    lpi0 lpi0VarM59671t = lpi0.m59671t();
                    lpi0VarM59671t.m59673v(sdb.m77825m0(CaptureRequest.CONTROL_AF_TRIGGER), 2);
                    xvbVar.m92221i(new sdb(jvl0.m54384j(lpi0VarM59671t), 11));
                    mpzVar.f146116a.m87721n(Collections.singletonList(xvbVar.m92222j()));
                }
                MeteringRectangle[] meteringRectangleArr = mpz.f146115h;
                mpzVar.f146119d = meteringRectangleArr;
                mpzVar.f146120e = meteringRectangleArr;
                mpzVar.f146121f = meteringRectangleArr;
                wcbVar.m87722o();
            }
        }
        sze1 sze1Var = this.f249994i;
        if (sze1Var.f215554e != z) {
            sze1Var.f215554e = z;
            if (!z) {
                synchronized (sze1Var.f215551b) {
                    sze1Var.f215551b.m82072e();
                    tze1 tze1Var = sze1Var.f215551b;
                    c18Var = new c18(tze1Var.m82071d(), tze1Var.m82069b(), tze1Var.m82070c(), tze1Var.m82068a());
                }
                xoi0 xoi0Var = sze1Var.f215552c;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    xoi0Var.mo33104m(c18Var);
                } else {
                    xoi0Var.m33101j(c18Var);
                }
                sze1Var.f215553d.mo31909g();
                sze1Var.f215550a.m87722o();
            }
        }
        ey9 ey9Var = this.f249995j;
        if (ey9Var.f63990a != z) {
            ey9Var.f63990a = z;
            if (!z) {
                if (ey9Var.f63991b) {
                    ey9Var.f63991b = false;
                    wcb wcbVar2 = (wcb) ey9Var.f63992c;
                    wcbVar2.f250002q = false;
                    xvb xvbVar2 = new xvb(0);
                    xvbVar2.f266335a = wcbVar2.f250007v;
                    xvbVar2.f266336b = true;
                    lpi0 lpi0VarM59671t2 = lpi0.m59671t();
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                    lpi0VarM59671t2.m59673v(sdb.m77825m0(key), Integer.valueOf(m87715k(wcbVar2.f249990e, 1)));
                    lpi0VarM59671t2.m59673v(sdb.m77825m0(CaptureRequest.FLASH_MODE), 0);
                    xvbVar2.m92221i(new sdb(jvl0.m54384j(lpi0VarM59671t2), 11));
                    wcbVar2.m87721n(Collections.singletonList(xvbVar2.m92222j()));
                    wcbVar2.m87722o();
                    xoi0 xoi0Var2 = (xoi0) ey9Var.f63993d;
                    if (hxg1.m49010w()) {
                        xoi0Var2.mo33104m(0);
                    } else {
                        xoi0Var2.m33101j(0);
                    }
                }
                gbb gbbVar = (gbb) ey9Var.f63994e;
                if (gbbVar != null) {
                    gbbVar.m44212c(new CameraControl$OperationCanceledException("Camera is not active."));
                    ey9Var.f63994e = null;
                }
            }
        }
        zmn0 zmn0Var = this.f249996k;
        if (z != zmn0Var.f284322b) {
            zmn0Var.f284322b = z;
            if (!z) {
                synchronized (((fox) zmn0Var.f284323c).f71637a) {
                }
            }
        }
        pcb pcbVar = this.f249998m;
        ((htz0) pcbVar.f176005e).execute(new i57(pcbVar, z, 1));
        if (z) {
            return;
        }
        ((AtomicInteger) this.f250000o.f98072b).set(0);
        vie1.m85624f("VideoUsageControl");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:57:0x016a A[LOOP:5: B:55:0x0164->B:57:0x016a, LOOP_END] */
    /* JADX INFO: renamed from: n */
    public final void m87721n(List list) {
        ArrayMap arrayMap;
        ArrayMap arrayMap2;
        int iM94683b;
        int iM94682a;
        ceb cebVar;
        idb idbVar = (idb) this.f249991f.f72807b;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yvb yvbVar = (yvb) it.next();
            HashSet hashSet = new HashSet();
            lpi0.m59671t();
            ArrayList arrayList2 = new ArrayList();
            nqi0.m65450a();
            hashSet.addAll(yvbVar.f276632a);
            lpi0 lpi0VarM59672u = lpi0.m59672u(yvbVar.f276633b);
            int i = yvbVar.f276634c;
            arrayList2.addAll(yvbVar.f276635d);
            boolean z = yvbVar.f276636e;
            fs61 fs61Var = yvbVar.f276637f;
            ArrayMap arrayMap3 = new ArrayMap();
            for (String str : fs61Var.f72778a.keySet()) {
                arrayMap3.put(str, fs61Var.f72778a.get(str));
            }
            nqi0 nqi0Var = new nqi0(arrayMap3);
            ceb cebVar2 = (yvbVar.f276634c != 5 || (cebVar = yvbVar.f276638g) == null) ? null : cebVar;
            if (!Collections.unmodifiableList(yvbVar.f276632a).isEmpty() || !yvbVar.f276636e) {
                ArrayList arrayList3 = new ArrayList(hashSet);
                jvl0 jvl0VarM54384j = jvl0.m54384j(lpi0VarM59672u);
                ArrayList arrayList4 = new ArrayList(arrayList2);
                fs61 fs61Var2 = fs61.f72777b;
                arrayMap = new ArrayMap();
                arrayMap2 = nqi0Var.f72778a;
                for (String str2 : arrayMap2.keySet()) {
                    arrayMap.put(str2, arrayMap2.get(str2));
                }
                arrayList.add(new yvb(arrayList3, jvl0VarM54384j, i, arrayList4, z, new fs61(arrayMap), cebVar2));
            } else if (hashSet.isEmpty()) {
                oce oceVar = idbVar.f101033a;
                oceVar.getClass();
                ArrayList arrayList5 = new ArrayList();
                for (Map.Entry entry : oceVar.f163909a.entrySet()) {
                    hla1 hla1Var = (hla1) entry.getValue();
                    if (hla1Var.f92662f && hla1Var.f92661e) {
                        arrayList5.add(((hla1) entry.getValue()).f92657a);
                    }
                }
                Iterator it2 = Collections.unmodifiableCollection(arrayList5).iterator();
                while (it2.hasNext()) {
                    yvb yvbVar2 = ((vxz0) it2.next()).f245872g;
                    List listUnmodifiableList = Collections.unmodifiableList(yvbVar2.f276632a);
                    if (!listUnmodifiableList.isEmpty()) {
                        if (yvbVar2.m94682a() != 0 && (iM94682a = yvbVar2.m94682a()) != 0) {
                            lpi0VarM59672u.m59673v(jla1.f113570G0, Integer.valueOf(iM94682a));
                        }
                        if (yvbVar2.m94683b() != 0 && (iM94683b = yvbVar2.m94683b()) != 0) {
                            lpi0VarM59672u.m59673v(jla1.f113571H0, Integer.valueOf(iM94683b));
                        }
                        Iterator it3 = listUnmodifiableList.iterator();
                        while (it3.hasNext()) {
                            hashSet.add((mjq) it3.next());
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    vie1.m85617F("Camera2CameraImpl");
                } else {
                    ArrayList arrayList6 = new ArrayList(hashSet);
                    jvl0 jvl0VarM54384j2 = jvl0.m54384j(lpi0VarM59672u);
                    ArrayList arrayList7 = new ArrayList(arrayList2);
                    fs61 fs61Var3 = fs61.f72777b;
                    arrayMap = new ArrayMap();
                    arrayMap2 = nqi0Var.f72778a;
                    while (r6.hasNext()) {
                        arrayMap.put(str2, arrayMap2.get(str2));
                    }
                    arrayList.add(new yvb(arrayList6, jvl0VarM54384j2, i, arrayList7, z, new fs61(arrayMap), cebVar2));
                }
            } else {
                vie1.m85617F("Camera2CameraImpl");
            }
        }
        idbVar.m50339t("Issue capture request");
        idbVar.f101029Y.m60109j(arrayList);
    }

    /* JADX INFO: renamed from: o */
    public final long m87722o() {
        this.f250008w = this.f250006u.getAndIncrement();
        ((idb) this.f249991f.f72807b).m50324K();
        return this.f250008w;
    }

    @Override // p204p.veb
    /* JADX INFO: renamed from: f */
    public final void mo78867f(q440 q440Var) {
    }
}
