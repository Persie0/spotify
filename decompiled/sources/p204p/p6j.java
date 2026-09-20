package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class p6j {

    /* JADX INFO: renamed from: a */
    public final int f174406a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f174407b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final int f174408c;

    /* JADX INFO: renamed from: d */
    public final c7j f174409d;

    public p6j(Context context, XmlResourceParser xmlResourceParser) {
        this.f174408c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), b2u0.f22713q);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f174406a = typedArrayObtainStyledAttributes.getResourceId(index, this.f174406a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f174408c);
                this.f174408c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    c7j c7jVar = new c7j();
                    this.f174409d = c7jVar;
                    c7jVar.m31736f((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
