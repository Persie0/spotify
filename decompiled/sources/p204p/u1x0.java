package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class u1x0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f225931a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f225932b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public static final Object f225933c = new Object();

    /* JADX INFO: renamed from: a */
    public static float m82232a(int i, Resources resources) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ds4.m36747b(i, resources);
        }
        ThreadLocal threadLocal = f225931a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m82233b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m82234c(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m82234c(Context context, int i, TypedValue typedValue, int i2, hv90 hv90Var, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM88658a = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            oab0 oab0Var = wo91.f253412b;
            Typeface typeface = (Typeface) oab0Var.m66541c(wo91.m88659b(resources, i, string, i3, i2));
            if (typeface != null) {
                if (hv90Var != null) {
                    hv90Var.m48757r(typeface);
                }
                typefaceM88658a = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        wzz wzzVarM28740u = bcg1.m28740u(resources.getXml(i), resources);
                        if (wzzVarM28740u != null) {
                            typefaceM88658a = wo91.m88658a(context, wzzVarM28740u, resources, i, string, typedValue.assetCookie, i2, hv90Var, z);
                        } else if (hv90Var != null) {
                            hv90Var.m48756q(-3);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceMo26668Q0 = wo91.f253411a.mo26668Q0(context, resources, i, string, i2);
                        if (typefaceMo26668Q0 != null) {
                            oab0Var.m66542d(wo91.m88659b(resources, i, string, i4, i2), typefaceMo26668Q0);
                        }
                        if (hv90Var != null) {
                            if (typefaceMo26668Q0 != null) {
                                hv90Var.m48757r(typefaceMo26668Q0);
                            } else {
                                hv90Var.m48756q(-3);
                            }
                        }
                        typefaceM88658a = typefaceMo26668Q0;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (hv90Var != null) {
                        hv90Var.m48756q(-3);
                    }
                }
            }
        } else if (hv90Var != null) {
            hv90Var.m48756q(-3);
        }
        if (typefaceM88658a != null || hv90Var != null || z2) {
            return typefaceM88658a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
