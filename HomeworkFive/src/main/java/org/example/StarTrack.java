package org.example;

import java.util.Objects;

public class StarTrack {
    private Point start;
    private Point finish;

    public void setStart(Point start){
        this.start = start;
    }

    public Point getStart(){
        return start;
    }

    public void setFinish(Point finish){
        this.finish = finish;
    }

    public Point getFinish(){
        return finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StarTrack starTrack)) return false;
        return Objects.equals(getStart(), starTrack.getStart()) && Objects.equals(getFinish(), starTrack.getFinish());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStart(), getFinish());
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        StarTrack point = (StarTrack) obj;
//        return (start == point.start || (start != null && start.equals(point.getStart()))) &&
//                (finish == point.finish || (finish != null && finish.equals(point.getFinish())));
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((start == null) ? 0 : start.hashCode());
//        result = prime * result + ((finish == null) ? 0 : finish.hashCode());
//        return result;
//    }
}
