package p204p;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebView;
import com.spotify.music.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i2h1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f97845a;

    /* JADX INFO: renamed from: a */
    public static final void m49485a(ze2 ze2Var, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, xq00 xq00Var, int i) {
        fyf fyfVarM75772x;
        xq00Var.m91775k0(-140580940);
        int i2 = i | (xq00Var.m91766g(ze2Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var2) ? 256 : 128) | (xq00Var.m91770i(eh00Var3) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            fxh0 fxh0VarM61842z = mi21.m61842z(mi21.m61819c(1.0f, cxh0.f43038a), d7f0.f46142M0, 2);
            if (ze2Var.f281853h != 0) {
                xq00Var.m91771i0(-453292544);
                fyfVarM75772x = rkk.m75772x(1110534999, new ue2(eh00Var2, ze2Var), xq00Var);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-453026440);
                xq00Var.m91788r(false);
                fyfVarM75772x = null;
            }
            e95.m38197b(eh00Var3, fxh0VarM61842z, null, fyfVarM75772x, null, null, rkk.m75772x(1051732828, new ue2(ze2Var, eh00Var), xq00Var), xq00Var, ((i2 >> 9) & 14) | 1573248, 48);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1690b3(ze2Var, eh00Var, eh00Var2, eh00Var3, i, 17);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r11v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v27 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v27 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v27 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v27 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v30 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v30 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v31 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v31 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v4 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v4 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v4 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v4 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v4 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v4 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v4 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v4 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v6 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v6 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r52v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r52v0 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r52v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r52v0 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r52v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r52v0 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r52v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r52v0 ??, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r52v0 p.xq00, new type: p.xq00
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX INFO: renamed from: b */
    public static final void m49486b(String str, String str2, String str3, String str4, int i, eh00 eh00Var, eh00 eh00Var2, jk11 jk11Var, eh00 eh00Var3, eh00 eh00Var4, eh00 eh00Var5, xq00 xq00Var, int i2) {
        xq00 xq00Var2;
        float f;
        boolean z;
        String strM12k;
        xq00 xq00Var3;
        jk11 jk11Var2 = jk11Var;
        eh00 eh00Var6 = eh00Var3;
        eh00 eh00Var7 = eh00Var4;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-2137346163);
        ug5 ug5Var = xq00Var.f264811a;
        int i3 = i2 | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(str2) ? 32 : 16) | (xq00Var.m91766g(str3) ? 256 : 128) | (xq00Var.m91766g(str4) ? 2048 : 1024) | (xq00Var.m91762e(i) ? 16384 : 8192) | (xq00Var.m91770i(eh00Var) ? 131072 : 65536) | (xq00Var.m91770i(eh00Var2) ? 1048576 : 524288) | (xq00Var.m91770i(jk11Var2) ? 8388608 : 4194304) | (xq00Var.m91770i(eh00Var6) ? 67108864 : 33554432) | (xq00Var.m91770i(eh00Var7) ? 536870912 : 268435456);
        if (xq00Var.m91752Y(i3 & 1, ((i3 & 306783379) == 306783378 && ((xq00Var.m91770i(eh00Var5) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            boolean z2 = jk11Var2 != null;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61820d(1.0f, cxh0Var), n6f.m63765b(n6f.f150862b, 0.85f, 0.0f, 0.0f, 0.0f, 14), kxf1.f127485a);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == obj) {
                objM91750T = tfe.m80656n(xq00Var);
            }
            fxh0 fxh0VarM47245v = hdi.m47245v(fxh0VarM64246i, (voi0) objM91750T, null, false, null, null, eh00Var5, 28);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM47245v);
            soh.f211194A.getClass();
            boolean z3 = z2;
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            fxh0 fxh0VarM96830A = zsf1.m96830A(zfg1.m96028q(mi21.m61820d(1.0f, cxh0Var), zfg1.f282319g), leu.m58816b(xq00Var).f117230b.f224764g, 0.0f, 2);
            ub9 ub9Var = d7f0.f46145P0;
            zhi0 zhi0Var = bj5.f27612c;
            aaf aafVarM87496a = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96830A);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            kvu kvuVar = kvu.f126953c;
            long j = n6f.f150866f;
            y85.m93057b(kvuVar, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159604b, zsf1.m96832C(cxh0Var, 0.0f, leu.m58816b(xq00Var).f117230b.f224767j, 0.0f, 0.0f, 13)), j, 0L, true, xq00Var, kvu.f126954d | 196656, 16);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, new cr70(1.0f, true));
            m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46174i, false);
            int iHashCode3 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, fxh0VarM61822f);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode3, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var);
            fxh0 fxh0VarM64246i2 = nec.m64246i(mi21.m61822f(1.0f, cxh0Var), leu.m58815a(xq00Var).f112823a.f229876c, hmx0.m47993b(leu.m58816b(xq00Var).f117230b.f224765h));
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = tfe.m80656n(xq00Var);
            }
            voi0 voi0Var = (voi0) objM91750T2;
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == obj) {
                objM91750T3 = sfe0.f208563b;
                xq00Var.m91793t0(objM91750T3);
            }
            fxh0 fxh0VarM96866z = zsf1.m96866z(hdi.m47245v(fxh0VarM64246i2, voi0Var, null, false, null, null, (eh00) objM91750T3, 28), leu.m58816b(xq00Var).f117230b.f224764g, leu.m58816b(xq00Var).f117230b.f224766i);
            aaf aafVarM87496a2 = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode4 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m4 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var, fxh0VarM96866z);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m4, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode4, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s4, yhhVar4, xq00Var);
            int i4 = i3 >> 6;
            k2h1.m55172e(str3, str4, i, str2, null, z3, xq00Var, (i4 & 1022) | ((i3 << 6) & 7168), 16);
            if (z3) {
                xq00Var.m91771i0(1536146148);
                f = leu.m58816b(xq00Var).f117230b.f224760c;
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1536224454);
                f = leu.m58816b(xq00Var).f117230b.f224764g;
                xq00Var.m91788r(false);
            }
            riw0.m75615i(xq00Var, mi21.m61824h(f, cxh0Var));
            if (z3) {
                xq00Var.m91771i0(1536367643);
                jk11Var2 = jk11Var;
                eh00Var6 = eh00Var3;
                eh00Var7 = eh00Var4;
                x0h1.m89565h(jk11Var2, eh00Var6, eh00Var7, xq00Var, (i3 >> 21) & 1022);
                xq00Var.m91788r(false);
                xq00Var3 = xq00Var;
            } else {
                jk11Var2 = jk11Var;
                eh00Var6 = eh00Var3;
                eh00Var7 = eh00Var4;
                xq00Var.m91771i0(1536580396);
                ahf1.m25932d(k0e1.m54977L(R.string.membership_confirmation_title, xq00Var), null, leu.m58818d(xq00Var).f64968d, leu.m58815a(xq00Var).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2018);
                riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224762e, cxh0Var));
                if (str.length() > 0) {
                    xq00Var.m91771i0(1536981815);
                    strM12k = k0e1.m54978M(R.string.membership_confirmation_body_with_show_title, new Object[]{str}, xq00Var);
                    z = false;
                    xq00Var.m91788r(false);
                } else {
                    z = false;
                    strM12k = AbstractC0000a.m12k(xq00Var, 1537104575, R.string.membership_confirmation_body_without_show_title, xq00Var, false);
                }
                ahf1.m25932d(strM12k, null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2018);
                xq00 xq00Var4 = xq00Var;
                k2h1.m55173f(i4 & 7168, 4, tfe.m80651i(cxh0Var, leu.m58816b(xq00Var).f117230b.f224765h, xq00Var, R.string.membership_confirmation_check_it_out, xq00Var), eh00Var, xq00Var4, mi21.m61816D(cxh0Var, null, 3), false);
                xq00Var4.m91788r(z);
                xq00Var3 = xq00Var4;
            }
            xq00Var3.m91788r(r28);
            xq00Var3.m91788r(r28);
            String strM54977L = k0e1.m54977L(R.string.membership_confirmation_got_it, xq00Var3);
            if71 if71Var = leu.m58818d(xq00Var3).f64972h;
            fxh0 fxh0VarM96832C = zsf1.m96832C(cxh0Var, 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var3).f117230b.f224763f, 7);
            Object objM91750T4 = xq00Var3.m91750T();
            if (objM91750T4 == obj) {
                objM91750T4 = tfe.m80656n(xq00Var3);
            }
            xq00 xq00Var5 = xq00Var3;
            ahf1.m25932d(strM54977L, hdi.m47245v(fxh0VarM96832C, (voi0) objM91750T4, null, false, null, null, eh00Var2, 28), if71Var, j, null, null, 0, false, null, 0, null, xq00Var5, 0, 0, 2032);
            xq00 xq00Var6 = xq00Var5;
            xq00Var6.m91788r(true);
            xq00Var6.m91788r(true);
            xq00Var2 = xq00Var6;
        } else {
            xq00 xq00Var7 = xq00Var;
            xq00Var7.m91757b0();
            xq00Var2 = xq00Var7;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ipl(str, str2, str3, str4, i, eh00Var, eh00Var2, jk11Var2, eh00Var6, eh00Var7, eh00Var5, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m49487c(if0 if0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-454779852);
        int i2 = (xq00Var.m91770i(if0Var) ? 4 : 2) | i;
        byte b = 0;
        int i3 = 1;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fyf fyfVar = a9h.f13568a;
            fyf fyfVarM75772x = rkk.m75772x(2035622509, new l021(if0Var, i3, b), xq00Var);
            float f = y481.f269099a;
            long j = n6f.f150870j;
            gfp gfpVar = leu.f132721a;
            w45.m87125a(fyfVar, null, fyfVarM75772x, null, 0.0f, null, y481.m92798f(j, ((fiu) ((u7q) iiu.f102631a.f258038c).f227741b).f69988v, leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138757a, xq00Var, 32), xq00Var, 390, 186);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new l021(if0Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m49488d(qf40 qf40Var, String str, fyf fyfVar, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1946023492);
        int i2 = (i & 6) == 0 ? (xq00Var.m91766g(qf40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            long j = leu.m58815a(xq00Var).f112823a.f229874a.f123094b;
            fmx0 fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148189e);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, nec.m64246i(cxh0Var, j, fmx0VarM47993b));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61822f);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            int i3 = i2;
            ahf1.m25932d(str, zsf1.m96832C(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 8), leu.m58818d(xq00Var).f64972h, leu.m58815a(xq00Var).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, (i2 >> 3) & 14, 0, 2032);
            riw0.m75615i(xq00Var, mi21.m61834r(leu.m58816b(xq00Var).f117230b.f224761d, cxh0Var));
            xq00Var.m91771i0(-1331166582);
            int i4 = 0;
            for (Object obj : qf40Var) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                fyfVar.mo25195e1(daf.f47039a, (String) obj, Integer.valueOf(i4), xq00Var, Integer.valueOf(((i3 << 3) & 7168) | 6));
                i4 = i5;
            }
            xq00Var.m91788r(false);
            rbz.m75199q(cxh0Var, leu.m58816b(xq00Var).f117230b.f224761d, xq00Var, true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new nns0(qf40Var, str, fyfVar, i, 21);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m49489e(tiv0 tiv0Var, float f, float f2) {
        float f3 = tiv0Var.f220751a;
        if (f > tiv0Var.f220753c || f3 > f) {
            return false;
        }
        return f2 <= tiv0Var.f220754d && tiv0Var.f220752b <= f2;
    }

    /* JADX INFO: renamed from: f */
    public static j4m0 m49490f(xq00 xq00Var) {
        ii01 ii01Var = zf10.f282178h;
        hxf hxfVar = ((zf10) xq00Var.m91774k(ag10.f15269a)).f282183c;
        float f = hxfVar.f96212d;
        float f2 = hxfVar.f96210b;
        return new j4m0(f, f2, f, f2);
    }

    /* JADX INFO: renamed from: g */
    public static InvocationHandler m49491g() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m49494j()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    /* JADX INFO: renamed from: h */
    public static float m49492h(xq00 xq00Var) {
        ii01 ii01Var = zf10.f282178h;
        return ((zf10) xq00Var.m91774k(ag10.f15269a)).f282186f.f128004a;
    }

    /* JADX INFO: renamed from: i */
    public static float m49493i(xq00 xq00Var) {
        ii01 ii01Var = zf10.f282178h;
        return ((zf10) xq00Var.m91774k(ag10.f15269a)).f282183c.f96209a;
    }

    /* JADX INFO: renamed from: j */
    public static ClassLoader m49494j() {
        if (Build.VERSION.SDK_INT >= 28) {
            return r35.m74576F();
        }
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null).getClass().getClassLoader();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static View m49495k(Context context, int i, ViewGroup viewGroup, int i2) {
        if ((i2 & 2) != 0) {
            viewGroup = null;
        }
        return LayoutInflater.from(context).inflate(i, viewGroup, false);
    }

    /* JADX INFO: renamed from: l */
    public static final t050 m49496l(z8k z8kVar, l02 l02Var, ljk0 ljk0Var, ljk0 ljk0Var2, ljk0 ljk0Var3, ljk0 ljk0Var4, ljk0 ljk0Var5, ljk0 ljk0Var6, ljk0 ljk0Var7, ljk0 ljk0Var8, ljk0 ljk0Var9, ljk0 ljk0Var10, ljk0 ljk0Var11, ljk0 ljk0Var12, ljk0 ljk0Var13, ljk0 ljk0Var14, ljk0 ljk0Var15) {
        return ((b9k) z8kVar).m28489g("MarqueeDaemon", new tjk0(l02Var, ljk0Var, ljk0Var2, ljk0Var3, ljk0Var4, ljk0Var5, ljk0Var6, ljk0Var7, ljk0Var8, ljk0Var9, ljk0Var10, ljk0Var11, ljk0Var12, ljk0Var13, ljk0Var14, ljk0Var15));
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m49497m(Context context) {
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        return !accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty();
    }

    /* JADX INFO: renamed from: n */
    public static float m49498n(int i) {
        int i2;
        if (i == 1) {
            i2 = 48;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(s571.m77251j("Unknown size ", edb.m38563l("ButtonSize(value=", i, ")"), "."));
            }
            i2 = 72;
        }
        return i2;
    }

    /* JADX INFO: renamed from: o */
    public static final jda1 m49499o(up60 up60Var) {
        jqv0 jqv0Var = qpv0.f191387a;
        if (up60Var.equals(jqv0Var.mo54112b(phg0.class)) || up60Var.equals(jqv0Var.mo54112b(ckg0.class))) {
            return hda1.f90091a;
        }
        if (up60Var.equals(jqv0Var.mo54112b(rkg0.class))) {
            return hda1.f90096f;
        }
        if (up60Var.equals(jqv0Var.mo54112b(alg0.class)) || up60Var.equals(jqv0Var.mo54112b(fkg0.class))) {
            return hda1.f90093c;
        }
        return up60Var.equals(jqv0Var.mo54112b(khg0.class)) ? hda1.f90092b : hda1.f90099i;
    }
}
