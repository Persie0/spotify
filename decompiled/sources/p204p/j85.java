package p204p;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes4.dex */
public final class j85 {

    /* JADX INFO: renamed from: a */
    public final uj5 f109793a = new uj5(0);

    public final String getAppId() {
        String string;
        Object obj = this.f109793a.get(kyx.f127930a);
        return (obj == null || (string = obj.toString()) == null) ? "" : string;
    }

    public final ContentValues getContentValues$continuity_release() {
        ContentValues contentValues = new ContentValues();
        uj5 uj5Var = this.f109793a;
        for (String str : (pj5) uj5Var.keySet()) {
            Object obj = uj5Var.get(str);
            if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
            } else if (obj instanceof Boolean) {
                contentValues.put(str, (Boolean) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str, (Integer) obj);
            } else if (obj instanceof Long) {
                contentValues.put(str, (Long) obj);
            } else if (obj instanceof byte[]) {
                contentValues.put(str, (byte[]) obj);
            } else {
                contentValues.put(str, String.valueOf(obj));
            }
        }
        return contentValues;
    }

    public final String getContextId() {
        String string;
        Object obj = this.f109793a.get("contextId");
        return (obj == null || (string = obj.toString()) == null) ? "" : string;
    }

    public final long getLastUpdatedTime() {
        String string;
        Object obj = this.f109793a.get("lastUpdatedTime");
        if (obj == null || (string = obj.toString()) == null) {
            return -1L;
        }
        return Long.parseLong(string);
    }

    public final long getLifeTime() {
        String string;
        Object obj = this.f109793a.get("lifeTime");
        if (obj == null || (string = obj.toString()) == null) {
            return -1L;
        }
        return Long.parseLong(string);
    }

    public final int getType() {
        String string;
        Object obj = this.f109793a.get("requestedContextType");
        if (obj == null || (string = obj.toString()) == null) {
            return 0;
        }
        return Integer.parseInt(string);
    }

    public final boolean hasValue$continuity_release(String str) {
        return this.f109793a.containsKey(str);
    }

    public final void setAction$continuity_release(String str) {
        this.f109793a.put("action", str);
    }

    public final void setAppId(String str) {
        this.f109793a.put(kyx.f127930a, str);
    }

    public final void setContextId(String str) {
        this.f109793a.put("contextId", str);
    }

    public final void setCreateTime(long j) {
        this.f109793a.put("createTime", Long.valueOf(j));
    }

    public final void setIntentUri(String str) {
        if (str.length() > 2083) {
            throw new IllegalArgumentException("intentUri exceeds the maximum length of 2083 characters");
        }
        this.f109793a.put("intentUri", str);
    }

    public final void setLastUpdatedTime(long j) {
        this.f109793a.put("lastUpdatedTime", Long.valueOf(j));
    }

    public final void setLifeTime(long j) {
        this.f109793a.put("lifeTime", Long.valueOf(j));
    }

    public final void setTriggerType$continuity_release(String str) {
        this.f109793a.put("triggerType", str);
    }

    public final void setType(int i) {
        this.f109793a.put("requestedContextType", Integer.valueOf(i));
    }

    public final void setVersion$continuity_release(double d) {
        this.f109793a.put("version", Double.valueOf(d));
    }
}
