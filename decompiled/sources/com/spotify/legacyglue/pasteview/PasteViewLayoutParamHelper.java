package com.spotify.legacyglue.pasteview;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public final class PasteViewLayoutParamHelper {
    private PasteViewLayoutParamHelper() {
    }

    public static ViewGroup.LayoutParams generateMatchParentLayoutParams(Context context, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        XmlResourceParser layout = context.getResources().getLayout(R.layout.paste_match_parent_width);
        do {
            try {
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        } while (layout.nextToken() != 2);
        return viewGroup.generateLayoutParams(layout);
    }

    public static ViewGroup.LayoutParams generateMatchParentWidthAndHeightLayoutParams(Context context, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        XmlResourceParser layout = context.getResources().getLayout(R.layout.paste_match_parent_width_and_height);
        do {
            try {
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        } while (layout.nextToken() != 2);
        return viewGroup.generateLayoutParams(layout);
    }

    public static ViewGroup.LayoutParams generateWrapContentLayoutParams(Context context, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        XmlResourceParser layout = context.getResources().getLayout(R.layout.paste_wrap_content);
        do {
            try {
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        } while (layout.nextToken() != 2);
        return viewGroup.generateLayoutParams(layout);
    }
}
